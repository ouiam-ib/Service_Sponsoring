package com.example.Spring;


import org.springframework.web.bind.annotation.GetMapping;
import java.sql.Connection;

import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class afficher {
    @GetMapping("/con")
    public ResultSet con() throws SQLException {
        Connection MyCon = ConnexionMysql.getConnection();
        //System.out.println("hello there!");
          MyCon.prepareStatement("insert into test values (10, 11)").execute();
          ResultSet i = MyCon.prepareStatement("select col1 from test").executeQuery();
          return i;
    }

    }



