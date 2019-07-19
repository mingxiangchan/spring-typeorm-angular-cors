package com.example.employeedemo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.employeedemo.entities.Employee;
import com.example.employeedemo.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 * EmployeeController
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;


    @GetMapping(value="/", produces="application/json")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }
    
    @PostMapping(value="/createEmployee", produces="application/json")
    public Employee postMethodName(@RequestBody Employee employee) {
        repository.save(employee);
        return employee;
    }
    
    
}