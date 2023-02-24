package com.company.kinotime.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class SingUp {
    @Id
    @GeneratedValue
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
