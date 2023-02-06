package com.jesuspinar.login_register_spring.controller;

import com.jesuspinar.login_register_spring.model.UserModel;
import com.jesuspinar.login_register_spring.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private IUserRepository iUserRepository;

    @GetMapping({"/register"})
    public String goToregister(Model model){
        model.addAttribute("user", new UserModel());
        return "register";
    }
    @PostMapping("/process_register")
    public String processRegister(UserModel user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        iUserRepository.save(user);
        return "index";
    }
  
}
