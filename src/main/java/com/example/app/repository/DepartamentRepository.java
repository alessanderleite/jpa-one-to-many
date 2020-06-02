package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Integer> {

}
