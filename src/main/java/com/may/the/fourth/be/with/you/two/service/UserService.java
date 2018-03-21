package com.may.the.fourth.be.with.you.two.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.may.the.fourth.be.with.you.two.model.Campaign;
import com.may.the.fourth.be.with.you.two.model.User;
import com.may.the.fourth.be.with.you.two.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public void save(User user) {
		String uri = environment.getProperty("uri.service.campaign") + user.getHeartTeamId();
		ResponseEntity<List<Campaign>> rateResponse =
		        restTemplate.exchange(uri,
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Campaign>>() {
		            });
		List<Campaign> campaigns = rateResponse.getBody();
		user.setCampaigns(campaigns);
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
