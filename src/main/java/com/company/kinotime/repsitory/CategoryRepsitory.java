package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepsitory extends JpaRepository<Category, UUID> {
}
