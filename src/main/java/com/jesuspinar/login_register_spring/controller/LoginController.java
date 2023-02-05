package com.jesuspinar.login_register_spring.controller;

import com.jesuspinar.login_register_spring.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/auth/login")
    public String login(Model model) {
        model.addAttribute("user", new UserModel());
        return "login";
    }

}
