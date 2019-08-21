package com.SpringBoot.crud.rest;

import com.SpringBoot.crud.dao.EmployeeDAO;
import com.SpringBoot.crud.entities.Employee;
import com.SpringBoot.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {
    @Autowired
    @Qualifier("jpaServiceImpl")
    EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        employeeService.addEmployee(employee);
        return "added";
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public int deleteEmployee(@PathVariable int employeeId){
        employeeService.deleteEmployee(employeeId);
        return employeeId;
    }
}
