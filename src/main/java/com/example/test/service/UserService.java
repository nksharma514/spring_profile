package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.test.model.User;
import com.example.test.repository.UserRepository;

@Service
@Profile(value = { "local", "dev", "prod" })
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> getUsers() {
		return repository.findAll();
	}

}
