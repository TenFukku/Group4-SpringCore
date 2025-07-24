package com.example.contextdemo.demo;

import com.example.contextdemo.framework.DemoSection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredDemo implements DemoSection {

    @Autowired
    private StudentService studentService;

    @Override
    public void run() {
        System.out.println("\n=== Running: AutowiredDemo ===");
        studentService.sayHello();
    }
}
