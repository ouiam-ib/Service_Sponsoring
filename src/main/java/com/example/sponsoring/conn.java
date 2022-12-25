package com.example.sponsoring;

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
        Connection MyCon = ConnectionDB.getConnection();

        if (MyCon == null){
            System.out.println("ERROR : No Connection!");
        }else {
            System.out.println("hello there!");
        }

    }
}
