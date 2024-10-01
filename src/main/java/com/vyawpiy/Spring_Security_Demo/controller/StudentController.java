package com.vyawpiy.Spring_Security_Demo.controller;

import com.vyawpiy.Spring_Security_Demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(21, "Piyush", 95),
            new Student(22, "Rohan", 93)
    ));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

}
