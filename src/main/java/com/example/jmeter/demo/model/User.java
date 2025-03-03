package com.example.jmeter.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class User {
    private String login;
    private String password;
    private LocalDateTime currentDate;
}
