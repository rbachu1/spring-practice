package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
              Student raj=  new Student(
                      "raj",
                      LocalDate.of(1988,Month.NOVEMBER,28),
                        "raj@gmail.com");

              Student shraz=new Student(
                      "shraz",
                      LocalDate.of(1996,Month.OCTOBER,27),
                      "shraz@gmail.com");
              repository.saveAll(List.of(raj,shraz));

        };
    }
}
