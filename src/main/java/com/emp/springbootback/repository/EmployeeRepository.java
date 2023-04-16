package com.emp.springbootback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.springbootback.model.Employee;
 
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
