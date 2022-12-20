package com.example.Spring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;

@RestController
public class hii {
    @GetMapping("/hi")
    public String hi(){

        return "Welcome To Spring boot";

        }

    }


