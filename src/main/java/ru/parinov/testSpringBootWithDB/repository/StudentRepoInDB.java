package ru.parinov.testSpringBootWithDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.parinov.testSpringBootWithDB.model.StudentEntity;

public interface StudentRepoInDB extends JpaRepository<StudentEntity, Long> {
    StudentEntity findStudentByEmail(String email);
    void deleteStudentByEmail(String email);
}