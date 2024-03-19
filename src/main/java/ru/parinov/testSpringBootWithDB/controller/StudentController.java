package ru.parinov.testSpringBootWithDB.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.parinov.testSpringBootWithDB.model.StudentEntity;
import ru.parinov.testSpringBootWithDB.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public List<StudentEntity> findAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public StudentEntity findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public StudentEntity updateStudent(@RequestBody StudentEntity student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudentByEmail(@PathVariable String email) {
        service.deleteStudentByEmail(email);
    }
}
