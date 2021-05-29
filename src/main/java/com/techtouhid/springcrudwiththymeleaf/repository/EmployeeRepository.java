package com.techtouhid.springcrudwiththymeleaf.repository;

import com.techtouhid.springcrudwiththymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
