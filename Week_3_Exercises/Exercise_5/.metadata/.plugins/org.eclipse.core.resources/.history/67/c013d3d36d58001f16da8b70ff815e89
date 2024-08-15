package com.code.employee.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="email", nullable=false, unique=true)
	private String email;
		
	//relationship with department one employee can work in one department
	//under one department there will be many employees
	@ManyToOne
	//creating a foreign key department id ref to the pk of department
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
	
	public Employee() {
		this.id = 0;
		this.name = null;
		this.email = null;
	}
}
