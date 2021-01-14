package com.deyevma.springappforentrytask.persistence.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "phone_number", nullable = false, unique = true)
    private Long phoneNumber;

    @Column (name = "email",nullable = false, unique = true)
    private String email;

    @Column (name = "password",nullable = false)
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
