package com.techtouhid.springcrudwiththymeleaf.service;

import com.techtouhid.springcrudwiththymeleaf.model.Employee;
import com.techtouhid.springcrudwiththymeleaf.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // find employee by id
    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id" + id);
        }
        return employee;
    }
}
