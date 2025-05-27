package com.example.StudentManagementApI.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagementApI.Model.Student;
import com.example.StudentManagementApI.Repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student save(Student student){
        return repository.save(student);
    }
    public List<Student> getAll() {
        return repository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return repository.findById(id);
    }

    public Student update(Long id, Student updatedStudent) {
        Student student = repository.findById(id).orElseThrow();
        student.setName(updatedStudent.getName());
        student.setEmail(updatedStudent.getEmail());
        student.setCourse(updatedStudent.getCourse());
        return repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
