package com.spring.springmongorabbit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.springmongorabbit.model.Employee;
import com.spring.springmongorabbit.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	RabbitMQService rabbitMQService;

	@Autowired
	EmployeeRepository empRepository;

	public List<Employee> getEmployees() {
		Boolean isMsgPublish = false;
		List<Employee> empList = empRepository.findAll();
		isMsgPublish = rabbitMQService.publishMesaage(empList);
		if (isMsgPublish)
			return empList;
		else
			return null;
	}

}
