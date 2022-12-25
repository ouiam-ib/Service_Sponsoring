package com.example.sponsoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static Connection connexion = null ;
    private static void seConnecter(){
        System.out.println("Début de connexion ...");
        try  {
            // Etape 1 : Chargement du Driver
            System.out.println(" Essai du Chargement du Driver .....");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println(" Chargement de Pilote OK");
//                // Etape Connexion sur la base de données
            String url = "jdbc:mysql://localhost:3306/SPONSORING";
            connexion = DriverManager.getConnection(url, "root", "");
            System.out.println("Connexion établie .. ");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Pb de chargement de Pilote");
        }catch (SQLException ex)
        {
            System.out.println("Pb de Connexion URL Login ou Password incorrect !!!");
        }
    }
    public static Connection getConnection()
    {
        if(connexion == null) seConnecter();

        return connexion;
    }
}
