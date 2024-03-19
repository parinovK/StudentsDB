package ru.parinov.testSpringBootWithDB.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.parinov.testSpringBootWithDB.model.StudentEntity;
import ru.parinov.testSpringBootWithDB.repository.RepoStudentInMemory;
import ru.parinov.testSpringBootWithDB.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {
    private final RepoStudentInMemory repository;
    @Override
    public List<StudentEntity> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return repository.saveStudent(student);
    }

    @Override
    public StudentEntity findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudentByEmail(String email) {
        repository.deleteStudentByEmail(email);
    }
}
