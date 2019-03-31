package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeInter {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
}
