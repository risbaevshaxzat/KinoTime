package com.company.kinotime.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Janr {

    private Integer id;


    private String name;


    private Category category;


    private LocalDateTime creat_data;

}
