package com.spring.momgodb.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.momgodb.model.Employee;
import com.spring.momgodb.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	EmployeeRepository empRepository;

	EmployeeController(EmployeeRepository empRepository) {
		this.empRepository = empRepository;
	}

	@GetMapping("/")
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		System.out.println("home");
		return "addemp";
	}

	@GetMapping("employees")
	public  ResponseEntity<List<Employee>> getEmployees() {
		return ResponseEntity.ok(empRepository.findAll());
	}
}
