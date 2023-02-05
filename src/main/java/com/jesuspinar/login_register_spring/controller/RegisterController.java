package com.jesuspinar.login_register_spring.controller;

import com.jesuspinar.login_register_spring.model.UserModel;
import com.jesuspinar.login_register_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @GetMapping("/auth/register")
    public String register(Model model) {
        model.addAttribute("user", new UserModel());
        return "register";
    }
    @PostMapping("/auth/register")
    public String register(@ModelAttribute UserModel user) {

        userService.register(user);
        return "redirect:/auth/login";

    }
}
