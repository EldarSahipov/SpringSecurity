package com.example.springsecurity.controller;

import com.example.springsecurity.entity.Student;
import com.example.springsecurity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showStudents() {
        return studentService.showStudents();
    }

}
