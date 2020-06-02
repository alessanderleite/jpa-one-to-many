package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
