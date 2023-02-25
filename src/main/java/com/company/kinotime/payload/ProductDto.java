package com.company.kinotime.payload;

import com.company.kinotime.entity.Actors;
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

public class ProductDto {


    private Integer id;


    private String name;


    private String ishlab_chiqqan_yil;


    private String country;


    private String rejisor;


    private String produser;


    private Actors actors;


    private String description;


    private String image;


    private String sifat;


    private String joylandi;


    private String  davomiyligi;


    private Movie_type_enum movie_type;


    private String janr;


    private BayMovie tekin_pulli;

}
