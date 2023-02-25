package com.company.kinotime.payload;

import com.company.kinotime.entity.Profile;
import jakarta.persistence.*;

import java.util.List;

public class SingUpDto {

    private Integer id;

    @Column( length = 50)
    private String firstName;

    @Column( length = 50)
    private String lastName;

    @Column( length = 50)
    private String  email;

    @Column( length = 50)
    private String password;


}
