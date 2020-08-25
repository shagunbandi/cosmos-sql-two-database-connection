package com.shagunbandi.cosmossql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableCosmosRepositories;
import com.shagunbandi.cosmossql.repository.cosmos.UserRepository;
import com.shagunbandi.cosmossql.repository.sql.CustomerRepository;

@SpringBootApplication
@EnableCosmosRepositories(basePackageClasses = UserRepository.class)
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
public class CosmosSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmosSqlApplication.class, args);
	}

}
