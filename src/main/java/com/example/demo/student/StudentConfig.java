package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bruno = new Student(
                    "Bruno",
                    "bruno.uemura@gmail.com",
                    LocalDate.of(1998, AUGUST, 24)
            );

            Student carla = new Student(
                    "Carla",
                    "carla.uemura@gmail.com",
                    LocalDate.of(1977, FEBRUARY, 12)
            );

            repository.saveAll(
                    List.of(bruno, carla)
            );
        };
    }
}
