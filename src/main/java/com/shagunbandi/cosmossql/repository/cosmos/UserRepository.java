package com.shagunbandi.cosmossql.repository.cosmos;

import org.springframework.beans.factory.annotation.Qualifier;

import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableCosmosRepositories;
import com.shagunbandi.cosmossql.model.User;

@EnableCosmosRepositories
@Qualifier("cosmos")
public interface UserRepository extends CosmosRepository<User, String> {
	User findByFirstName(String firstName);
}