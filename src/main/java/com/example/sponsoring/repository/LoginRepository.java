package com.example.sponsoring.repository;

import com.example.sponsoring.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findbyUsernameAndPassword(String username, String password);

}
