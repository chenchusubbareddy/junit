package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDao {

	List<Employee> employess = new ArrayList<Employee>();

	public EmployeeDao() {
		employess.add(new Employee(1, "name1", 1000));
		employess.add(new Employee(2, "name2", 2000));
		employess.add(new Employee(3, "name3", 3000));
	}

	public List<Employee> getAllEmployees() {
		return employess;
	}
}
