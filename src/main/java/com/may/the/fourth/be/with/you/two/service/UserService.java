package com.may.the.fourth.be.with.you.two.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.may.the.fourth.be.with.you.two.model.User;
import com.may.the.fourth.be.with.you.two.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}
	
	public User read(String id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public void delete(String id) {
		User user = read(id);
		if(user != null) {
			userRepository.delete(user);
		}
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
}
