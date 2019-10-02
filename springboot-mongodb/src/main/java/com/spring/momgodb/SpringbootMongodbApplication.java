package com.spring.momgodb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.momgodb.model.Employee;
import com.spring.momgodb.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

	@Autowired
	EmployeeRepository empRepository;

	@Override
	public void run(String... args) throws Exception {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("E1", 100, "Vishal", "Kumar", 26, "male", "Java", 1000));
		empList.add(new Employee("E2", 101, "Kamlesh", "Singh", 32, "male", "dotnet", 3000));
		empList.add(new Employee("E3", 102, "Ranjana", "Kumari", 20, "female", "mongodb", 5000));

		empRepository.save(empList);
		System.out.println(empList.size() + "  Employees Saved in spring-mongo database ");
	}

}
