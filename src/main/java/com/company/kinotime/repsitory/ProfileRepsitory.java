package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Product;
import com.company.kinotime.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfileRepsitory extends JpaRepository<Profile, UUID> {
}
