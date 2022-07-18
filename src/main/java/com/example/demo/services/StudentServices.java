package com.example.demo.services;

import com.example.demo.domain.StudentDTO;

import java.util.List;

public interface StudentServices {
    List<StudentDTO> findAllUsers();

    String saveUser(StudentDTO userData);



}
