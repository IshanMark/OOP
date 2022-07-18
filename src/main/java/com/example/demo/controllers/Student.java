package com.example.demo.controllers;

import com.example.demo.domain.StudentDTO;
import com.example.demo.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Student {
    @Autowired
    private StudentServices studentServices;

    @GetMapping("/all")
    public List<StudentDTO> allUsers(){
        return studentServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody StudentDTO userData){
        return studentServices.saveUser(userData);

    }



}
