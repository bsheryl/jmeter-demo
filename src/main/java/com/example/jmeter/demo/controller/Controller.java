package com.example.jmeter.demo.controller;

import com.example.jmeter.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user")
public class Controller {
    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("{\"message\": \"response success\"}");
    }

    @PostMapping
    public ResponseEntity<User> post(@RequestBody User user) {
        user.setCurrentDate(LocalDateTime.now());
        return ResponseEntity.ok(user);
    }
}
