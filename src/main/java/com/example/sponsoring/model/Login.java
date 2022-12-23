package com.example.sponsoring.model;

public class Login {
    private int id_log;
    private String login;
    private String password;

    public Login(){

    }

    public Login(int id_log, String login, String password){
        this.id_log = id_log;
        this.login = login;
        this.password = password;
    }

    public int getId_log() {
        return id_log;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
