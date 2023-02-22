package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Actors;
import com.company.kinotime.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepsitory extends JpaRepository<Product, UUID> {
}
