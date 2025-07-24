package com.example.contextdemo.demo;

import com.example.contextdemo.framework.DemoSection;
import com.example.contextdemo.service.ExpensiveBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LazyInitDemo implements DemoSection {

    @Autowired
    private ExpensiveBean expensiveBean;

    @Override
    public void run() {
        System.out.println("\n=== Running: LazyInitDemo ===");
        System.out.println("[LazyInitDemo] Bắt đầu gọi phương thức từ bean tốn tài nguyên...");

        expensiveBean.work();

        System.out.println("[LazyInitDemo] Đã gọi xong!");
    }
}
