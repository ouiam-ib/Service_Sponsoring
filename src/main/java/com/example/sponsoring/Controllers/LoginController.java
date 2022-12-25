package com.example.sponsoring.Controllers;

import com.example.sponsoring.Services.LoginService;
import com.example.sponsoring.model.Login;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class LoginController {
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index(){
        return "index.html";
    }
    @RequestMapping(value = "/login/{username},{passwd}", method = RequestMethod.POST)
    public String WelcomePage(@ModelAttribute("Login") Login login){
        Login auth = loginService.login(login.getLogin(), login.getPassword());
        System.out.println(auth);
        if(Objects.isNull(auth)){
            System.out.println("try again");
            return "redirect:/index.html";
        }else{
            System.out.println("welcome");
            return " redirect:/login.html";
        }
    }
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logout(HttpServletRequest request, HttpServletResponse response){
        return "index.html";
    }
}
