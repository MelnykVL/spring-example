package com.melnyk.springexample.configuration;

import com.melnyk.springexample.model.Student;
import com.melnyk.springexample.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> studentRepository.saveAll(List.of(
                new Student("Vlad", "vlad@gmail.com", LocalDate.of(1999, Month.OCTOBER, 7)),
                new Student("Andriy", "melnyk@gmail.com", LocalDate.of(1975, Month.JULY, 20))
        ));
    }
}
