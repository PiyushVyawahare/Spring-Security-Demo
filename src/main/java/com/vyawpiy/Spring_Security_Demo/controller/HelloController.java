package com.vyawpiy.Spring_Security_Demo.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello World!! " + request.getSession().getId();
    }


    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "About VyawPiy " + request.getSession().getId();
    }
}
