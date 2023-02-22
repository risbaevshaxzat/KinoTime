package com.company.kinotime.payload;

import com.company.kinotime.entity.Profile;
import jakarta.persistence.Column;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Singin {

    @Column( length = 50)
    private String username;

    @Column( length = 50)
    private String email;

    @Column( length = 50)
    private String password;

    
}
