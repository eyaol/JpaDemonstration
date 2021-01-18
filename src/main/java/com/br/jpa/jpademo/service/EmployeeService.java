package com.br.jpa.jpademo.service;

import com.br.jpa.jpademo.repository.entity.Employee;

public interface EmployeeService {

    Employee getEmployeeByName(String name);
    void saveEmployee(Employee employee);

}
