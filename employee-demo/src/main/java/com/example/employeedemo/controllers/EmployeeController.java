package com.example.employeedemo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.employeedemo.entities.Employee;
import com.example.employeedemo.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * EmployeeController
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;


    @GetMapping(value="/")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }
    
    
}