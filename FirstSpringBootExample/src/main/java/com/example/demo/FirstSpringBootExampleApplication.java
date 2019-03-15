package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootExampleApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		List<Employee> allEmployees = employeeService.getAllEmployees();
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

}
