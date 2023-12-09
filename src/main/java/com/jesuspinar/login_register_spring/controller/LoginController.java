package com.jesuspinar.login_register_spring.controller;

import com.jesuspinar.login_register_spring.model.UserModel;
import com.jesuspinar.login_register_spring.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private IUserRepository iUserRepository;

    @GetMapping("/login")
    public String goToLogin(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, AuthenticationManager authManager){
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authResult = authManager.authenticate(authRequest);
        SecurityContextHolder.getContext().setAuthentication(authResult);
        return "redirect:/";
    }

}
