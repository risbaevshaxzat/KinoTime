package com.company.kinotime.controller;

import com.company.kinotime.payload.ApiResponse;
import com.company.kinotime.payload.ProfileDto;
import com.company.kinotime.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    ProfileService profileService;

    @PostMapping("/register")
    public HttpEntity<?>  registerAll(@RequestBody ProfileDto profileDto){
        ApiResponse apiResponse = profileService.registerProfil(profileDto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);

    }
}
