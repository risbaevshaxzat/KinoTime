package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Product;
import com.company.kinotime.entity.Singin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import java.util.UUID;

public interface SinginRepsitory extends JpaRepository<Singin, UUID> {
    Authentication authenticate(UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken);
}
