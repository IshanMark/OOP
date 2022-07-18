package com.example.demo.services.impl;

import com.example.demo.domain.StudentDTO;
import com.example.demo.repo.StudentRepo;
import com.example.demo.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServices {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<StudentDTO> findAllUsers() {

        List<StudentDTO> allusers = studentRepo.findAll();
        return allusers;
    }

    @Override
    public String saveUser(StudentDTO userData) {
        studentRepo.save(userData);
        return "Data saved";
    }

}
