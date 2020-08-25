package com.shagunbandi.cosmossql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shagunbandi.cosmossql.model.Customer;
import com.shagunbandi.cosmossql.model.User;
import com.shagunbandi.cosmossql.service.CosmosService;
import com.shagunbandi.cosmossql.service.SqlService;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
	
	@Autowired
	private SqlService sqlService;
	
	@Autowired
	private CosmosService cosmosService;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		Customer n = new Customer();
		n.setName(name);
		n.setEmail(email);
		sqlService.saveCustomer(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody List<Customer> getAllUsers() {
		return sqlService.findAll();
	}
	

	@GetMapping(path="/", produces="application/json")
	public User getUser(@RequestParam String id) {
		return cosmosService.getUser(id);
	}
	
	@PostMapping(path="/", consumes="application/json")
	public void saveUser(@RequestBody User user) {
		cosmosService.saveUser(user);
	}
}