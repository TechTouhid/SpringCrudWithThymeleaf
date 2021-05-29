package com.techtouhid.springcrudwiththymeleaf.service;

import com.techtouhid.springcrudwiththymeleaf.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
