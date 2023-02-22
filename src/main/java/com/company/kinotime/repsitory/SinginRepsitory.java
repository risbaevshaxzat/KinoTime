package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Product;
import com.company.kinotime.entity.Singin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SinginRepsitory extends JpaRepository<Singin, UUID> {
}
