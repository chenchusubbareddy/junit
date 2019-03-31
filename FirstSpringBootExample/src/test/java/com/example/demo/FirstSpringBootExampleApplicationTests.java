package com.example.demo;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FirstSpringBootExampleApplicationTests {
	
	@Autowired
	EmployeeInter employeeService;

	@Mock
	StudentInter studentInter;

	@Test
	public void contextLoads() {

	}

	@Test
	public void getAllEmployees() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		allEmployees.forEach(employeeService -> System.out.println(employeeService));

	}

	@Test
	public void getAllStudents() {
		when(studentInter.getAllStudents()).thenReturn(Arrays.asList(new Student(1, "sname1", 1000)));
		System.out.println(studentInter.getAllStudents());
	}
}
