package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Product;
import com.company.kinotime.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SearchRepsitory extends JpaRepository<Search, UUID> {
}
