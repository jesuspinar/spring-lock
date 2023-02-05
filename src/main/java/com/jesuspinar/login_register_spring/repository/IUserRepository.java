package com.jesuspinar.login_register_spring.repository;

import com.jesuspinar.login_register_spring.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByEmail(String email);
}
