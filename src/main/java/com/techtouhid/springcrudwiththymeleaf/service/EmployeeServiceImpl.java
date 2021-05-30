package com.techtouhid.springcrudwiththymeleaf.service;

import com.techtouhid.springcrudwiththymeleaf.model.Employee;
import com.techtouhid.springcrudwiththymeleaf.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // show the data on web
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // save the data to the database /insert data
    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }
}
