package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Product;
import com.company.kinotime.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepsitory extends JpaRepository<Role, UUID> {
}
