package com.spring.springmongorabbit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends MongoRepository<com.spring.springmongorabbit.model.Employee, Integer> {

}
