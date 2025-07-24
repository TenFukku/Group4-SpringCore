package com.example.contextdemo.demo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public String getStudentName() {
        return "Vỹ Linh";
    }
}
