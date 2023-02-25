package com.company.kinotime.config;

import com.company.kinotime.entity.Profile;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class SpringSecurityProfile implements AuditorAware<Integer> {


    @Override
    public Optional<Integer> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null &&
                authentication.isAuthenticated() &&
                !authentication.getPrincipal().equals("anonymousUser")) {

            Profile profile = (Profile) authentication.getPrincipal();
            return  Optional.of(profile.getId());
                    //Optional.of(employee.getId());
        }
        return Optional.empty();
    }
}