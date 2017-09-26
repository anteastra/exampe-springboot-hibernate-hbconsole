package com.anteastra.example.hibernate.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

/**
 * Created by anteastra on 26.09.2017.
 */
@SpringBootApplication
@EntityScan("com.anteastra.example.hibernate.spring.entities")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}