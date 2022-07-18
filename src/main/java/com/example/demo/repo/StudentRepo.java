package com.example.demo.repo;

import com.example.demo.domain.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentDTO,Integer> {

}
