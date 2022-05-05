package com.lincoln.employeesystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "User's first name cannot be empty.")
    private String firstName;

    @NotEmpty(message = "User's last name cannot be empty.")
    private String lastName;

    @Column(unique=true)
    @NotEmpty(message = "Email cannot be empty.")
    private String email;

    @NotEmpty(message = "User job title cannot be empty.")
    private String jobTitle;

    private double salary;

}
