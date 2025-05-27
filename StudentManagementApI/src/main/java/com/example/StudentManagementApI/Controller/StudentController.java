package com.example.StudentManagementApI.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.StudentManagementApI.Model.Student;
import com.example.StudentManagementApI.Service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    // POST /students – Add a student
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return service.save(student);
    }

    // GET /students – Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    // GET /students/{id} – Get student by ID
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT /students/{id} – Update student by ID
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return service.update(id, student);
    }

    // DELETE /students/{id} – Delete student by ID
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
