package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(StudentService studentService) {
        return args -> {
            System.out.println("Đang khởi tạo dữ liệu mẫu...");

            Student student1 = new Student();
            student1.setFirstName("Thiên Phúc");
            student1.setLastName("Đỗ Nguyễn");
            student1.setEmail("22521112.gm.uit.edu.vn");
            studentService.createStudent(student1);

            Student student2 = new Student();
            student2.setFirstName("Đấu La");
            student2.setLastName("Phúc Thần");
            student2.setEmail("thienphuc310104@gmail.com");
            studentService.createStudent(student2);

            System.out.println("Đã tạo xong dữ liệu mẫu.");
        };
    }

}