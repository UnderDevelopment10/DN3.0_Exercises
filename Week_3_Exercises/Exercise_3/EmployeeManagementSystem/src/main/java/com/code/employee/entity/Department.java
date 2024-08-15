package com.code.employee.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="departments")
@Getter
@Setter
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	// creating a relationship with Employee One to Many
	// in one department there will be many employees
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;

}
