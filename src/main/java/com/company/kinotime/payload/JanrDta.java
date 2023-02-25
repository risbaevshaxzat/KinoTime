package com.company.kinotime.payload;

import com.company.kinotime.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class JanrDta {

    private Integer id;


    private String name;


    private Category category;


    private LocalDateTime creat_data;

}
