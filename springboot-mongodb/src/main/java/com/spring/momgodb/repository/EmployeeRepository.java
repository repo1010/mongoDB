package com.spring.momgodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.momgodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
