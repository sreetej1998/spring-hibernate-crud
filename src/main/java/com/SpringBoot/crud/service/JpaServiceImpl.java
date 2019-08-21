package com.SpringBoot.crud.service;

import com.SpringBoot.crud.entities.Employee;
import com.SpringBoot.crud.jpadao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;
    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> result=repository.findById(id);
        if(result.isPresent())
            return result.get();
        else
            throw new RuntimeException("invallid id");
    }

    @Override
    public Employee addEmployee(Employee employee) {
        repository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        repository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
    repository.deleteById(id);
    }
}
