package com.bellogate.controller;
import com.bellogate.entity.Employee;
import com.bellogate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public Collection<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping
    public Employee getEmployee(@RequestBody Employee employee){
        return employeeService.create(employee);
    }
}
