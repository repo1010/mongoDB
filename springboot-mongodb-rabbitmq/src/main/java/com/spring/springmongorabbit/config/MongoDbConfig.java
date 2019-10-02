package com.spring.springmongorabbit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.springmongorabbit.repository.EmployeeRepository;


@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
@Configuration
public class MongoDbConfig {

}
