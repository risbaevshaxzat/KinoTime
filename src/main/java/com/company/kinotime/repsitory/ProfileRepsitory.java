package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Enums.RoleName;
import com.company.kinotime.entity.Product;
import com.company.kinotime.entity.Profile;
import com.company.kinotime.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Optional;
import java.util.UUID;

public interface ProfileRepsitory extends JpaRepository<Profile, UUID> {
    Optional<Profile> findByEmail(String email);
    Role findByRoleName(RoleName roleName);

    boolean existsByEmail(@NotNull @Email String email);
}
