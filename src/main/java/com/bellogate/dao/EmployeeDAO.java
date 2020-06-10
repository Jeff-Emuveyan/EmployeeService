package com.bellogate.dao;


import com.bellogate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class EmployeeDAO {

    @Autowired
    EmployeeRepository employeeRepository;

    public Collection<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRepository.insert(employee);
    }
}
