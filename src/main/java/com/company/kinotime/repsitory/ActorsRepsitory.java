package com.company.kinotime.repsitory;

import com.company.kinotime.entity.Actors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActorsRepsitory extends JpaRepository<Actors , UUID> {
}
