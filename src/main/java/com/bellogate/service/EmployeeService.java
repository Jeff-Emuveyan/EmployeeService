package com.bellogate.service;


import com.bellogate.dao.EmployeeDAO;
import com.bellogate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public Collection<Employee> getEmployees(){
       return employeeDAO.getEmployees();
    }

    public Employee create(Employee employee) {
        return employeeDAO.create(employee);
    }
}
