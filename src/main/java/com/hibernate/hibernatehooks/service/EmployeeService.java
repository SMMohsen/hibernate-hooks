package com.hibernate.hibernatehooks.service;

import com.hibernate.hibernatehooks.model.Employee;
import com.hibernate.hibernatehooks.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    public List<Employee> getAll() {

        return employeeRepository.findAll();
    }

}
