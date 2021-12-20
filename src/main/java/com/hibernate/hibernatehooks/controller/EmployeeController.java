package com.hibernate.hibernatehooks.controller;

import com.hibernate.hibernatehooks.model.Employee;
import com.hibernate.hibernatehooks.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {

        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAll() {

        return employeeService.getAll();
    }
}
