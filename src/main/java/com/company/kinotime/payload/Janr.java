package com.company.kinotime.payload;

import com.company.kinotime.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Janr {

    private Integer id;


    private String name;


    private Category category;


    private LocalDateTime creat_data;

}
