package com.company.kinotime.service;

import com.company.kinotime.entity.Enums.RoleName;
import com.company.kinotime.entity.Profile;
import com.company.kinotime.entity.Role;
import com.company.kinotime.payload.ApiResponse;
import com.company.kinotime.payload.ProfileDto;
import com.company.kinotime.payload.SinginDto;
import com.company.kinotime.repsitory.ProfileRepsitory;
import com.company.kinotime.repsitory.RoleRepsitory;
import com.company.kinotime.repsitory.SinginRepsitory;
import com.company.kinotime.security.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfileService {

    @Autowired
    ProfileRepsitory profileRepsitory;
    @Autowired
    MailService mainlSecvice;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    RoleRepsitory roleRepsitory;

    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    SinginRepsitory singinRepsitory;


    public ApiResponse registerProfil(ProfileDto profileDto){
        boolean existByEmail = profileRepsitory.existsByEmail(profileDto.getEmail());
        if (existByEmail) {
            return new ApiResponse("Such an email already exists in the system", false);
        }
        Profile profile =new Profile();
        profile.setFirstName(profileDto.getFirstName());
        profile.setLastName(profileDto.getLastName());
        profile.setEmail(profileDto.getEmail());
        profile.setRoles(Collections.singletonList(profileRepsitory.findByRoleName(RoleName.ROLE_USER)));
        profile.setEmailCode(UUID.randomUUID().toString());

        profileRepsitory.save(profile);
        try {
            sendEmail(profile.getEmail());
            return new ApiResponse("Successfully registered", true);
        } catch (Exception e) {
            return new ApiResponse("Fail", false);
        }
    }
    public void sendEmail(String sendingEmail) throws Exception {
        mainlSecvice.sendEmail(
                sendingEmail,
                "Set password",
                "<a href='http://localhost:8080/api/employeeAuth/password-set?email=" + sendingEmail + "'>Set Password</a>"
        );
    }

    public ApiResponse setPassword(ProfileDto profileDto) {

        Optional<Profile> optionalProfile = profileRepsitory.findByEmail(profileDto.getEmail());
        if (optionalProfile.isEmpty()) {
            return new ApiResponse("Employee not found", false);
        }
        Profile profile = optionalProfile.get();
        profile.setPassword(profileDto.getPassword());
        profileRepsitory.save(profile);
        return new ApiResponse("Success", true, profile);
    }
    public ApiResponse login(SinginDto singinDto) {
        try {
            Authentication authentication = singinRepsitory.authenticate(new UsernamePasswordAuthenticationToken(
                    singinDto.getUsername(),
                    singinDto.getPassword()));
            Profile profile = (Profile) authentication.getPrincipal();
            String token = jwtProvider.generateToken(singinDto.getUsername(), (Set<Role>) profile.getRoles());
            return new ApiResponse("Token", true, token);
        } catch (BadCredentialsException badCredentialsException) {
            return new ApiResponse("Login or Password is incorrect", false);
        }

    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return profileRepsitory.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username + "not found"));
    }
    }



