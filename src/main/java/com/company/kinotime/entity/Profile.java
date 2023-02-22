package com.company.kinotime.entity;

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
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Profile implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, updatable = false)
    private String  email;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    private List<Role> roles;

    @Column(nullable = false,updatable = false)
    @CreationTimestamp
    private Timestamp createAT;

    @UpdateTimestamp
    private Timestamp updateAt;

    private String emailCode;

    private boolean accountNonExpired=true;// bu userning amal qilish muddati otmagan
    private boolean accountNonLocked=true;//bu user bloklamgan
    private boolean credentialsNonExpired=true;
    private boolean enabled;

    // BU userDetilsning majbury metodlari



    /// nu userning xquqlari royxatti
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    //userning passwording qaytarish
    @Override
    public String getPassword() {
        return this.password;
    }

    // userning user name qaytaradi
    @Override
    public String getUsername() {
        return this.email;
    }

    //accauntning bloklamaganiiligini holatin qaytaradi
    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    //accauntning ishonchlik mudddati tugagan yoky tugamagnligi  qaytaradi
    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    // accauntning aktyvligini qaytaradingan
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
