package com.company.kinotime.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cuntry;

    @Column(nullable = false)
    private String aktroy;

    @Column(nullable = false)
    private String janir;

    @Column(nullable = false)
    private String year_of_manufacture;

    @Column(nullable = false)
    @ManyToMany
    private List<Product> product_id;


}
