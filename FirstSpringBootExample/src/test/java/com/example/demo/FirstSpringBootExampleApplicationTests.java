package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FirstSpringBootExampleApplicationTests {
	@Autowired
	EmployeeService employeeService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllEmployees() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		allEmployees.forEach(employeeService -> System.out.println(employeeService));
	}

}
