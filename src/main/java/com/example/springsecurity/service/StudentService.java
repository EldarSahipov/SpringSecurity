package com.example.springsecurity.service;

import com.example.springsecurity.entity.Student;
import com.example.springsecurity.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    public List<Student> showStudents() {
        return studentRepository.findAll();
    }

}
