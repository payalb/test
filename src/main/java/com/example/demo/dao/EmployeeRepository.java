package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	
	public List<Employee>  getEmployeesByName(String name);
}
