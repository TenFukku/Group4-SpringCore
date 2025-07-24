package com.example.contextdemo.config;

import com.example.contextdemo.service.DatabaseLogger;
import com.example.contextdemo.service.SupportService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DatabaseLogger databaseLogger() {
        return new DatabaseLogger();
    }

    @Bean
    public SupportService supportService() {
        return new SupportService();
    }

}
