package com.shagunbandi.cosmossql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shagunbandi.cosmossql.model.Customer;
import com.shagunbandi.cosmossql.repository.sql.CustomerRepository;

@Service
public class SqlService {

	@Autowired
	private CustomerRepository repository;

	public Customer getCustomer(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
