package com.example.contextdemo.demo;

import org.springframework.stereotype.Component;

@Component("loggerService")
public class LoggerService {

    public void log(String message) {
        System.out.println("[LoggerService] " + message);
    }
}
