package com.example.sponsoring.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Table(name="login")
public class Login {
    @Id
    private int id_log;
    @Column(name="username")
    private String login;
    @Column(name="passwd")
    private String passwd;

    public Login(){

    }

    public Login(String login, String password){
        this.login = login;
        this.passwd = password;
    }

    public int getId_log() {
        return id_log;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return passwd;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.passwd = password;
    }
}
