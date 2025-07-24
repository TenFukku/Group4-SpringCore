package com.example.contextdemo.demo;

import com.example.contextdemo.framework.DemoSection;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemo implements DemoSection {

    @PostConstruct
    public void init() {
        System.out.println("LifecycleDemo: Bean đã được tạo xong (PostConstruct)");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("LifecycleDemo: Bean chuẩn bị bị huỷ (PreDestroy)");
    }

    @Override
    public void run() {
        System.out.println("\n=== Running: LifecycleDemo ===");
        System.out.println("[LifecycleDemo] Demo vòng đời bean bắt đầu...");
        System.out.println("Xem log bên trên để thấy @PostConstruct đã được gọi.");
        System.out.println("Khi app kết thúc, @PreDestroy sẽ tự được gọi.\n");
    }
}
