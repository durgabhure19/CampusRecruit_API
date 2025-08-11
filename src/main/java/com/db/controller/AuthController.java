package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.entity.Student;
import com.db.entity.User;
import com.db.model.LoginRequest;
import com.db.service.StudentServiceImpl;
import com.db.service.UserServiceImpl;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping("/user-login")
	public User userLogin(@RequestBody LoginRequest loginRequest) {

		return userServiceImpl.authenticateUser(loginRequest);
	}

	@PostMapping("/student-login")
	public Student studentLogin(@RequestBody LoginRequest loginRequest) {

		return studentServiceImpl.authenticateStudent(loginRequest);
	}

}
