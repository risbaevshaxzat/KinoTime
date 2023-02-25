package com.company.kinotime.payload;

import com.company.kinotime.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchDto {


    private UUID id;

    @Column( length = 50)
    private String name;

    @Column( length = 50)
    private String cuntry;

    @Column( length = 50)
    private String aktroy;

    @Column( length = 50)
    private String janir;

    @Column( length = 50)
    private String year_of_manufacture;



}
