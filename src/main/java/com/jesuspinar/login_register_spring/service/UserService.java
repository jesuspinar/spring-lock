package com.jesuspinar.login_register_spring.service;

import com.jesuspinar.login_register_spring.model.UserModel;
import com.jesuspinar.login_register_spring.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	IUserRepository repo;

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	public UserModel register(UserModel u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return repo.save(u);
	}

}
