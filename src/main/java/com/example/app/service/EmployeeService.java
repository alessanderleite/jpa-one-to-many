package com.example.app.service;

import java.util.List;

import com.example.app.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	Employee addEmployee(Employee employee);
	Employee editEmployee(Employee entity);
	void deleteEmployee(Integer id);
}
