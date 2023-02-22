package com.company.kinotime.repsitory;

import com.company.kinotime.entity.SingUp;
import com.company.kinotime.entity.Singin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SingUpRepsitory extends JpaRepository<SingUp, UUID> {
}
