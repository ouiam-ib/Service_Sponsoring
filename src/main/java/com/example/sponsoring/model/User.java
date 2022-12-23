package com.example.sponsoring.model;
import com.example.sponsoring.repository.ConnectionDB;

import java.sql.*;
import java.util.Scanner;

public class User {
    static Connection MyCon = ConnectionDB.getConnection();

    public static void Create(Integer cne,String login, String email, String password) {
        System.out.println("ADD NEW USER");
        PreparedStatement Pst;
        try {
            String Req = "insert into LOGINS values(?, ?, ?, ?);";
            Pst = MyCon.prepareStatement(Req);
            Pst.setInt(1, cne);
            Pst.setString(2, login);
            Pst.setString(3, email);
            Pst.setString(4, password);

            Pst.executeUpdate();
            System.out.println("AJOUT RESUSSI");
        }catch(SQLException ex) {
            System.out.println("Prob avac query add???? " + ex.getMessage());
        }
    }

    public static void Lister() {
        Statement St;
        ResultSet Rs;

        try {
            System.out.println("Lister les users:");
            St = MyCon.createStatement();
            String Req = "Select * from LOGINS;";
            Rs = St.executeQuery(Req);

            while(Rs.next()) {
                System.out.println(Rs.getInt("cne")+ " "+Rs.getString("login")+ " " + Rs.getString("email") + " "+ Rs.getString("password"));
            }
        }catch(SQLException ex) {
            System.out.println("Pb avec la requete " + ex.getMessage());
        }
    }

    public static void Delete() {
        System.out.println("DELETE ONE USER WITH CNE");
        String Req = "Delete from LOGINS where cne=?";
        PreparedStatement Pst;
        try {
            Pst = MyCon.prepareStatement(Req);
            Scanner Sc = new Scanner(System.in);
            System.out.println("Entrer le CNE: ");
            Integer cne = Sc.nextInt();
            Pst.setInt(1, cne);
            int ligne = Pst.executeUpdate();
            if(ligne != 0)
                System.out.println("Suppression Reussi de " + cne);
            else
                System.out.println("Pas d'user avec le CNE " + cne);
        }catch(SQLException ex) {
            System.out.println("Pb dans la suppression §§§" + ex.getMessage());
        }

    }

    public static void Update() {
        PreparedStatement Pst;
        System.out.println("UPDATE PASSWORD FOR USER");
        String Req = "Update LOGINS set password  = ? where cne=?";
        try {
            Pst = MyCon.prepareStatement(Req);
            Scanner Sc = new Scanner(System.in);
            System.out.println("cne : ");
            Integer cne = Sc.nextInt();
            System.out.println("le nouveau password:");
            String password = Sc.next();
            Pst.setInt(1,  cne);
            Pst.setString(2, password);
            int ligne = Pst.executeUpdate();
            if(ligne != 0)
                System.out.println("Update Reussi de " + cne);
            else
                System.out.println("Pas d'user avec le CNE " + cne);

        }catch(SQLException ex) {
            System.out.println("Pb de modification §§§" + ex.getMessage());
        }
    }

}




