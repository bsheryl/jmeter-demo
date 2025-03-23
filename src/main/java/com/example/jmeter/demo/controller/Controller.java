package com.example.jmeter.demo.controller;

import com.example.jmeter.demo.model.Message;
import com.example.jmeter.demo.model.User;
import io.micrometer.core.annotation.Timed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user")
public class Controller {
    @GetMapping
    @Timed(value = "simple_get_method_execution_time", description = "Time taken to execute simple GET method")
    public ResponseEntity<Message> get() {
        Message message = new Message();
        message.setMessage("success");
        return ResponseEntity.ok(message);
    }

    @PostMapping
    @Timed(value = "simple_post_method_execution_time", description = "Time taken to execute simple POST method")
    public ResponseEntity<User> post(@RequestBody User user) throws IllegalAccessException{
        if (user.getLogin().isEmpty() || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Login or password is empty");
        }
        user.setCurrentDate(LocalDateTime.now());
        return ResponseEntity.ok(user);
    }
}
