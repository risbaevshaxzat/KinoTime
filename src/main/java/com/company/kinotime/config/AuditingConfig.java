package com.company.kinotime.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {

    @Bean
    SpringSecurityProfile auditorAware() {

        return new SpringSecurityProfile();
    }

}
