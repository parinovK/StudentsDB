package ru.parinov.testSpringBootWithDB.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentEntity {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}
