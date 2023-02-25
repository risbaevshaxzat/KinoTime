package com.company.kinotime.payload;

import com.company.kinotime.entity.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProfileDto  {


    private Integer id;

    @Column( length = 50)
    private String firstName;

    @Column( length = 50)
    private String lastName;

    @Column( length = 50)
    private String  email;

    @Column( length = 50)
    private String password;

    private List<Role> roles;
    private Timestamp createAT;
    private Timestamp updateAt;


}
