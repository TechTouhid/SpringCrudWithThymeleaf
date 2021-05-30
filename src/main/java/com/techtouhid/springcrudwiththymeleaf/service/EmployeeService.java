package com.techtouhid.springcrudwiththymeleaf.service;

import com.techtouhid.springcrudwiththymeleaf.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    // save the data to the database /insert data
    void saveEmployee(Employee employee);

    // find employee by id
    Employee getEmployeeById(long id);
}
