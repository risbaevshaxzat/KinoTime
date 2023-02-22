package com.company.kinotime.entity;

import jakarta.persistence.*;

import java.util.List;

public class SingUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, updatable = false)
    private String  email;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    private List<Profile> profile;
}
