package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	int id;
	String name;
}
