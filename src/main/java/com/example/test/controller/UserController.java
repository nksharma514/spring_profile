package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.User;
import com.example.test.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("findAllUsers")
	public List<User> findAllUsers() {
		return service.getUsers();
	}

}
