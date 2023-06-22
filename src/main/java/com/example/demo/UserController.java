package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/employees")
    String all() {
        return "Get all employees!";
    }

    @GetMapping("/employees/{id}")
    String getOne(@PathVariable Long id) {
        return "Get employee id = " + id.toString();
    }
}
