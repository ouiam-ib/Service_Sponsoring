package com.example.sponsoring.Services;

import com.example.sponsoring.model.Login;
import com.example.sponsoring.repository.LoginRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class LoginService  {
    private LoginRepository repo;
    public Login login(String username, String password){
        Login l= repo.findbyUsernameAndPassword(username, password);
        return l;

    }

}
