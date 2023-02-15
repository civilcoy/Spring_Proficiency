package com.example.spring_proficiency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringProficiencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProficiencyApplication.class, args);
    }

}
