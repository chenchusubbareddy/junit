package com.chenchu.spring5Example_test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.chenchu.spring5Example.AppConfig;
import com.chenchu.spring5Example.Employee;
import com.chenchu.spring5Example.EmployeeService;

@ExtendWith(SpringExtension.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class EmployeeSerive_Test {

	@Autowired
	EmployeeService employeeService;

	@Test
	public void getAllEmployees_test() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}
}
