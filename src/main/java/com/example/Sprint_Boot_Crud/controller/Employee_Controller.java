package com.example.Sprint_Boot_Crud.controller;

import com.example.Sprint_Boot_Crud.model.Employee;
import com.example.Sprint_Boot_Crud.repository.Employee_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class Employee_Controller {
    @Autowired
    private Employee_repo employeeRepo;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }
}
