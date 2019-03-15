package com.chenchu.spring5Example;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService empService = ctx.getBean(EmployeeService.class);
		List<Employee> allEmployees = empService.getAllEmployees();
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}

	}
}
