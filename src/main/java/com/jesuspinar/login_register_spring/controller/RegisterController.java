package com.jesuspinar.login_register_spring.controller;

import com.jesuspinar.login_register_spring.model.UserModel;
import com.jesuspinar.login_register_spring.repository.IUserRepository;
import com.jesuspinar.login_register_spring.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping({"/register"})
    public String goToRegister(Model model){
        model.addAttribute("user", new UserModel());
        return "register";
    }
    @PostMapping("/register")
    public String processRegister(UserModel user) {
        //TODO: handle errors
        boolean isRegistered = userDetailsService.register(user);
        if (isRegistered){
            return "login";
        }
        return "index";
    }
  
}
