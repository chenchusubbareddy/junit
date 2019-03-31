package com.chenchu.spring5Example_test;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.chenchu.spring5Example.AppConfig;
import com.chenchu.spring5Example.Employee;
import com.chenchu.spring5Example.EmployeeInter;
import com.chenchu.spring5Example.Student;
import com.chenchu.spring5Example.StudentInter;
@ExtendWith({SpringExtension.class,MockitoExtension.class})
@ContextConfiguration(classes = { AppConfig.class })
public class EmployeeSerive_Test {

	@Autowired
	EmployeeInter employeeInter;

	
	@Mock	
	StudentInter studentInter;

	@Test
	public void getAllEmployees_test() {
		List<Employee> allEmployees = employeeInter.getAllEmployees();
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

	@Test
	public void getAllStudents() {
		when(studentInter.getAllStudents()).thenReturn(Arrays.asList(new Student(1,"sname1",1000)));
		System.out.println(studentInter.getAllStudents());
	}
}
