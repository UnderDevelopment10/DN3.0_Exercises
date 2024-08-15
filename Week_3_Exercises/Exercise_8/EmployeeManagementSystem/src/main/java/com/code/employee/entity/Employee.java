package com.code.employee.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NamedQueries({
	@NamedQuery(
		name = "Employee.findByEmail",
		query = "SELECT e FROM Employee e WHERE e.email = :email"
	),
	@NamedQuery(
			name = "Employee.findByDepartmentId",
			query = "SELECT e FROM Employee e WHERE e.department = :department"
	)
})
@EntityListeners(AuditingEntityListener.class)
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
	
	
	@CreatedDate
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdDate;
	
	@LastModifiedDate
	@Column(nullable = false)
	private LocalDateTime lastModifiedDate;
	
	@CreatedBy
	@Column(nullable = false)
	private String createdBy;
	
	@LastModifiedBy
	@Column(nullable = false)
	private String lastModifiedBy;
	
	
	
	public Employee() {
		this.id = 0;
		this.name = null;
		this.email = null;
	}
}
