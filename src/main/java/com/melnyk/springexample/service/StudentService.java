package com.melnyk.springexample.service;

import com.melnyk.springexample.model.Student;
import com.melnyk.springexample.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> list() {
        return studentRepository.findAll();
    }

    public void add(Student student) {
        studentRepository.save(student);
    }

    public void delete(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
