package com.code.employee.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.code.employee.entity.Employee;
import com.code.employee.projection.EmployeeProjection;
import com.code.employee.projection.EmployeeValueProjection;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	// Using the named query defined in Employee entity
	@Query(name = "Employee.findByEmail")
	Employee findByEmailNamed(@Param("email") String email);
	
	// Using the named query defined in Employee entity
	@Query(name = "Employee.findByEmail")
	Employee findByDepartmentIdNamed(@Param("email") int departmentId);
	
	// Derived query methods
	List<Employee> findByName(String name);
    List<Employee> findByDepartmentId(int DepartmentId);
    List<Employee> findByEmail(String email);
    
    
    //Find all employees with pagination and sorting
    Page<Employee> findAll(Pageable pageable);
    
    //Find employees by department with pagination and sorting
    Page<Employee> findByDepartmentId(int departmentId, Pageable pageable);
    
    
    
    
    // adding the query for employee projection
    @Query("SELECT e.name as name, e.email as email FROM Employee e ")
    List<EmployeeProjection> findByEmployee();
    // adding the query for employee projection by value
    @Query("SELECT e.name as name, e.email as email FROM Employee  e WHERE e.department.name = :departmentName")
    List<EmployeeValueProjection> findByDepartmentName(@Param("departmentName") String departmentName);
}
