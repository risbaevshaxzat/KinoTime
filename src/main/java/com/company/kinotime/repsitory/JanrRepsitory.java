package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Actors;
import com.company.kinotime.entity.Janr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JanrRepsitory extends JpaRepository<Janr, UUID> {
}
