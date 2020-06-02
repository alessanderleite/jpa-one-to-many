package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Departament;
import com.example.app.model.Employee;
import com.example.app.repository.DepartamentRepository;
import com.example.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartamentRepository departamentRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		Departament dept = departamentRepository.findById(employee
				.getDepartament().getId())
				.orElse(null);
		if (null == dept) {
			dept = new Departament();
		}
		dept.setDeptName(employee.getDepartament().getDeptName());
		employee.setDepartament(dept);
		return employeeRepository.save(employee);
	}

	@Override
	public Employee editEmployee(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}
	
	
}
