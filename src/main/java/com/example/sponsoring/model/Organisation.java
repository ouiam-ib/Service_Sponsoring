package com.example.sponsoring.model;
import java.util.*;
//Organisation class represents for a record ORGANISME TABLE.

public class Organisation {
    private int id_Org;
    private String nom;
    private String activite;
    private String domaine;
    private Date date_construction;

    public Organisation(){

    }

    public Organisation(int id_Org, String nom, String activite, String domaine, Date date_construction){
        this.id_Org = id_Org;
        this.nom = nom;
        this.activite = activite;
        this.domaine = domaine;
        this.date_construction = date_construction;
    }

    public int getId_Org() {
        return id_Org;
    }

    public String getActivite() {
        return activite;
    }

    public String getDomaine() {
        return domaine;
    }

    public Date getDate_construction() {
        return date_construction;
    }

    public String getNom() {
        return nom;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public void setDate_construction(Date date_construction) {
        this.date_construction = date_construction;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public void setId_Org(int id_Org) {
        this.id_Org = id_Org;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}

