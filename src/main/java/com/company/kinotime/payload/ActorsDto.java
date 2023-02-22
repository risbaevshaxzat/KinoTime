package com.company.kinotime.payload;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.validation.constraints.Size;
import java.util.UUID;

public class ActorsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private UUID id;

    private String name;

    private String surname;

    private String image;
}
