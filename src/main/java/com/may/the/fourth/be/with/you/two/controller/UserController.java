package com.may.the.fourth.be.with.you.two.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.may.the.fourth.be.with.you.two.model.User;
import com.may.the.fourth.be.with.you.two.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	@ResponseStatus(value=HttpStatus.CREATED)
	public void create(@RequestBody User user) {
		userService.save(user);
	}
	
	@GetMapping(value="/{id}")
	public User read(@PathVariable("id") String id) {
		return userService.read(id);
	}
	
	@PutMapping
	public void update(@RequestBody User user) {
		userService.save(user);
	}
	
	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

}
