package com.jesuspinar.login_register_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LoginRegisterSpringApp {
    public static void main(String[] args) {
        SpringApplication.run(LoginRegisterSpringApp.class, args);
    }

    /*
    //run this the first time or create a new user at database
    @Bean
    public CommandLineRunner initData(UserService userService) {
        return args -> {
            UserModel user = new UserModel(null,null,"user@mail.com","hidden");
            userService.register(user);
        };
    }
     */
}
