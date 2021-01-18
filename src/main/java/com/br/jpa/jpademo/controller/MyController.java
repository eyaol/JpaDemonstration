package com.br.jpa.jpademo.controller;

import com.br.jpa.jpademo.repository.entity.Employee;
import com.br.jpa.jpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    EmployeeService employeeService;

    //Endpoint to get employee by name
    @GetMapping("/employee/{name}")
    public Employee getAllEmployees(@PathVariable("name") String name) {
        return employeeService.getEmployeeByName(name);
    }
    
    //Endpoint to save employee in database
    @PostMapping("/save")
    public Long saveEmployee(@RequestBody Employee employee) {
    	employeeService.saveEmployee(employee);
    	return employee.getId();
    }
}
