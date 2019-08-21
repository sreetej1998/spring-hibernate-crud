package com.SpringBoot.crud.jpadao;

import com.SpringBoot.crud.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
