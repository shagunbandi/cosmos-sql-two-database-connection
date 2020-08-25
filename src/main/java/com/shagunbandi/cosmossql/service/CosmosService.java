package com.shagunbandi.cosmossql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shagunbandi.cosmossql.model.User;
import com.shagunbandi.cosmossql.repository.cosmos.UserRepository;

@Service
public class CosmosService {
	
	@Autowired
	private UserRepository userRepository;

	public User getUser(String id) {
		return userRepository.findById(id).orElse(null);
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}

}
