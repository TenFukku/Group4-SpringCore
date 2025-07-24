package com.example.contextdemo.demo;

import com.example.contextdemo.framework.DemoSection;
import org.springframework.stereotype.Component;

@Component
public class DependsOnDemo implements DemoSection {

    @Override
    public void run() {
        System.out.println("[DependsOnDemo] Demo bắt đầu...");
        System.out.println("Bean SupportService được khởi tạo sau DatabaseLogger vì dùng @DependsOn.");
    }
}
