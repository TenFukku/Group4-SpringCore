package com.example.contextdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void sayHello() {
        String name = studentRepository.getStudentName();
        System.out.println("StudentService: Xin chào bạn " + name + " nhé!");
    }
}
