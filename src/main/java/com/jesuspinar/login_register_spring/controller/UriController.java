package com.jesuspinar.login_register_spring.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UriController {
    @GetMapping({"/","index"})
    public String goToIndex(){
        return "index";
    }

    @GetMapping("dashboard")
    public String welcome() {
        boolean isNotAuthenticated = !SecurityContextHolder.getContext().getAuthentication().isAuthenticated();
        if (isNotAuthenticated){
           return goToIndex();
        }
        return "dashboard/welcome";
    }

}
