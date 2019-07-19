package com.example.employeedemo.repositories;

import com.example.employeedemo.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}