package com.aimar.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.aimar.entities.Employee;

public interface EmployeesCRUDRepository extends CrudRepository<Employee, Integer> {
	
	
}