package com.example.contextdemo.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.contextdemo.framework.DemoSection;

@Component
@Lazy // Chỉ tạo bean này khi thật sự cần dùng
public class SupportBot implements DemoSection {

    public SupportBot() {
        System.out.println("[SupportBot] Bean SupportBot đã được tạo ra!");
    }

    @Override
    public void run() {
        System.out.println("\n[SupportBot] Xin chào! Tui là bot hỗ trợ sinh viên");
    }
}
