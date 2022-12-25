package com.example.sponsoring;

import com.example.sponsoring.model.Login;
import com.example.sponsoring.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
@Data
@SpringBootApplication
public class WebApplication implements CommandLineRunner{
    @Autowired
    private CustomProperties properties;
    public static void main(String[] args){

        SpringApplication.run(WebApplication.class, args);

    }
    //@GetMapping("/")
    //public String homePage(){
        //return " redirect:/index.html";
    //}
    private LoginRepository lr;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(properties.getApiUrl());
    }
}
