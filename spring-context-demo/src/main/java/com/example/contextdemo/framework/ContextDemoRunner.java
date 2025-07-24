package com.example.contextdemo.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContextDemoRunner {

    private final List<DemoSection> sections;

    @Autowired
    public ContextDemoRunner(List<DemoSection> sections) {
        this.sections = sections;
    }

    public void runAll() {
        System.out.println("------ SPRING CONTEXT DEMO ------");
        for (DemoSection section : sections) {
            System.out.println("\n=== Running: " + section.getClass().getSimpleName() + " ===");
            section.run();
        }
        System.out.println("\n------ DEMO COMPLETE ------");
    }
}
