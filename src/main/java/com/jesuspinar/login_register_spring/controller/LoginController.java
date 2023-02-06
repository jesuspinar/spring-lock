package com.jesuspinar.login_register_spring.controller;

import com.jesuspinar.login_register_spring.model.UserModel;
import com.jesuspinar.login_register_spring.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired
    private IUserRepository iUserRepository;

    @GetMapping({"/login"})
    public String goToLogin(Model model){
        return "login";
    }

}
