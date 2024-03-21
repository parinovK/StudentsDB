package ru.parinov.testSpringBootWithDB.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.parinov.testSpringBootWithDB.model.StudentEntity;
import ru.parinov.testSpringBootWithDB.repository.StudentRepoInDB;
import ru.parinov.testSpringBootWithDB.service.StudentService;

import java.util.List;

@AllArgsConstructor
@Service
@Primary
public class InDbStudentService implements StudentService {
    private final StudentRepoInDB repository;
    @Override
    public List<StudentEntity> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return repository.save(student);
    }

    @Override
    public StudentEntity findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudentByEmail(String email) {
        repository.deleteStudentByEmail(email);
    }
}
