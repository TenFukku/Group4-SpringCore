package com.example.contextdemo.service;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ExpensiveBean {

    public ExpensiveBean() {
        System.out.println("ExpensiveBean: Constructor được gọi");
    }

    @PostConstruct
    public void init() {
        System.out.println("ExpensiveBean: Đã khởi tạo (@PostConstruct)");
    }

    public void work() {
        System.out.println("ExpensiveBean: Đang thực thi công việc...");
    }
}
