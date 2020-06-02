package com.example.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Departament {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq")
	@SequenceGenerator(initialValue = 1, name = "dept_seq", sequenceName = "dept_sequence")
	private Integer id;
	
	@Column(name = "deptName")
	private String deptName;
	
	@OneToMany(mappedBy = "departament", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Employee> employees;

	public Departament() {
	}

	public Departament(String deptName) {
		this.deptName = deptName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Departament [id=" + id + ", deptName=" + deptName + ", employees=" + employees + "]";
	}
		
}
