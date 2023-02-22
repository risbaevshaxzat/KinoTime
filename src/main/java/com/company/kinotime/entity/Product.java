package com.company.kinotime.entity;

import com.company.kinotime.entity.Enums.BayMovie;
import com.company.kinotime.entity.Enums.Movie_type_enum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String ishlab_chiqqan_yil;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String rejisor;

    @Column(nullable = false)
    private String produser;

    @Column(nullable = false)
    @OneToOne
    private Actors actors;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String sifat;

    @Column(nullable = false)
    private String joylandi;

    @Column(nullable = false)
    private String  davomiyligi;

    @Column(nullable = false)
    private Movie_type_enum movie_type;

    @Column(nullable = false)
    private String janr;

    @Column(nullable = false)
    private BayMovie tekin_pulli;
}
