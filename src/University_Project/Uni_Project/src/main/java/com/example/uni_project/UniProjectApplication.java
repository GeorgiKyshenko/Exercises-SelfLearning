package com.example.uni_project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com/example/uni_project/models"})
public class UniProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniProjectApplication.class, args);
    }
}
