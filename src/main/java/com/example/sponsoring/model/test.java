package com.example.sponsoring.model;
import java.sql.*;
public class test {
    public static void main(String[] args) {
        //Connection MyCon = ConnectionMYSQL.getConnection();

        User.Create(40000, "login2", "user2@gmail.com", "Ginf2");
        User.Create(50000, "login3", "user3@gmail.com", "Ginf2");
        User.Create(60000, "login4", "user4@gmail.com", "Ginf2");
        User.Lister();
        User.Delete();
        User.Lister();
        /*User.LogIn("login3", "Ginf2");
        User.LogIn("Login3", "Gif2");*/

    }
}
