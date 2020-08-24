package com.shagunbandi.cosmossql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shagunbandi.cosmossql.model.User;
import com.shagunbandi.cosmossql.service.CosmosService;

@RestController
public class MyController {
	
	@Autowired
	private CosmosService cosmosService;

	@GetMapping(path="/", produces="application/json")
	public User getUser(@RequestParam String id) {
		return cosmosService.getUser(id);
	}
	
	@PostMapping(path="/", consumes="application/json")
	public void saveUser(@RequestBody User user) {
		cosmosService.saveUser(user);
	}
	
}
