package com.shagunbandi.cosmossql.repository;

import org.springframework.stereotype.Repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import com.shagunbandi.cosmossql.model.User;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {
	User findByFirstName(String firstName);
}