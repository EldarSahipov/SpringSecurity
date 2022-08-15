package com.example.springsecurity.controller;

import com.example.springsecurity.entity.Student;
import com.example.springsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showStudents() {
        return studentService.showStudents();
    }

    @PostMapping("/createStudent")
    public Student createStudent(Student student) {
        return studentService.createStudent(student);
    }


}
