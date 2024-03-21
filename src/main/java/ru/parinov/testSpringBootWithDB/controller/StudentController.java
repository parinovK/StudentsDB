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

    @PostMapping("save")
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return service.saveStudent(student);
    }

    @GetMapping("find/{email}")
    public StudentEntity findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update")
    public StudentEntity updateStudent(@RequestBody StudentEntity student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete/{email}")
    public void deleteStudentByEmail(@PathVariable String email) {
        service.deleteStudentByEmail(email);
    }
}
