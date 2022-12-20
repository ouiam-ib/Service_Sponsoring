package com.example.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import java.sql.Connection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
    public class conn {
        @GetMapping("/conn")
        public static void main(String[] args) throws SQLException {
            Connection MyCon = ConnexionMysql.getConnection();
            System.out.println("hello there!");

        }

    }

