package ru.parinov.testSpringBootWithDB.repository;

import org.springframework.stereotype.Repository;
import ru.parinov.testSpringBootWithDB.model.StudentEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class RepoStudentInMemory {
    private final List<StudentEntity> STUDENTS = new ArrayList<>();

    public List<StudentEntity> findAllStudents(){
        return STUDENTS;
    }

    public StudentEntity saveStudent(StudentEntity student){
        STUDENTS.add(student);
        return student;
    }

    public StudentEntity findByEmail(String email){
        return STUDENTS.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public StudentEntity updateStudent(StudentEntity student){
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1){
            STUDENTS.set(studentIndex, student);
            return student;
        }
        return null;
    }

    public void deleteStudentByEmail(String email){
        var student = findByEmail(email);
        if (student != null)
            STUDENTS.remove(student);
    }
}
