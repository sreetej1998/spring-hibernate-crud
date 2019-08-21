package com.SpringBoot.crud.service;

import com.SpringBoot.crud.entities.Employee;

import java.util.List;

public interface EmployeeService {
public List<Employee> getEmployees();
public Employee getEmployee(int id);
public Employee addEmployee(Employee employee);
public Employee updateEmployee(Employee employee);
public void deleteEmployee(int id);

}
