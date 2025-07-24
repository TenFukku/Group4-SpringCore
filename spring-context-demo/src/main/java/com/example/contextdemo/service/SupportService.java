package com.example.contextdemo.service;

import org.springframework.context.annotation.DependsOn;

@DependsOn("databaseLogger")
public class SupportService {
    public SupportService() {
        System.out.println("SupportService: Đã khởi tạo (sau DatabaseLogger).");
    }
}
