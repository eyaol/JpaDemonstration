package com.br.jpa.jpademo.service;

import com.br.jpa.jpademo.repository.EmployeeRepository;
import com.br.jpa.jpademo.repository.entity.Employee;

import com.br.jpa.jpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
}
