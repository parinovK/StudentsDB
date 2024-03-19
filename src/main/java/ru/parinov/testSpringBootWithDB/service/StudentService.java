package ru.parinov.testSpringBootWithDB.service;

import ru.parinov.testSpringBootWithDB.model.StudentEntity;

import java.util.List;

public interface StudentService {
    public List<StudentEntity> findAllStudents();
    public StudentEntity saveStudent(StudentEntity student);
    public StudentEntity findByEmail(String email);
    public StudentEntity updateStudent(StudentEntity student);
    public void deleteStudentByEmail(String email);
}
