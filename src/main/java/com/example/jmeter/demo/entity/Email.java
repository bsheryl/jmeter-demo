package com.example.jmeter.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Email {
    @Id
    private String login;
    private String email;
    @OneToOne
    @MapsId
    @JoinColumn(name = "login", referencedColumnName = "login", nullable = false, unique = true)
    private User user;
}
