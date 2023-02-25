package com.company.kinotime.util;

import com.company.kinotime.entity.Singin;
import com.company.kinotime.repsitory.SinginRepsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    @Autowired
    SinginRepsitory singinRepsitory;

    @Override
    public void run(String... args) throws Exception {


    }
}
