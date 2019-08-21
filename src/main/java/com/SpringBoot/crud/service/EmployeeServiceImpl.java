package com.SpringBoot.crud.service;
import com.SpringBoot.crud.dao.EmployeeDAO;
import com.SpringBoot.crud.entities.Employee;
import com.SpringBoot.crud.jpadao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
    employeeDAO.deleteEmployee(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
     return employeeDAO.addEmployee(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDAO.getEmployees();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }
}
