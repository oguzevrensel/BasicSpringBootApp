package com.example.SpringProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student oguz = new Student(

                    "Oguz",
                    "oevrensel@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER,19)
            );

            Student cem = new Student(

                    "Cem",
                    "cem@hotmail.com",
                    LocalDate.of(1999, Month.JANUARY,18)
            );

            Student uzay = new Student(

                    "Uzay",
                    "uzaypardo@hotmail.com",
                    LocalDate.of(1997, Month.MARCH,6)
            );

            repository.saveAll(
                    List.of(oguz, cem, uzay)
            );
        };
    }
}
