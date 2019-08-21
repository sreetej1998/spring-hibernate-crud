package com.SpringBoot.crud.dao;

import com.SpringBoot.crud.entities.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    EntityManager entityManager;
    @Override
    @Transactional
    public List<Employee> getEmployees() {
        Session session=entityManager.unwrap(Session.class);
        Query<Employee> query=session.createQuery("from Employee",Employee.class);
        List<Employee> employees=query.getResultList();
        return employees;
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
        return employee;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        Session session=entityManager.unwrap(Session.class);
        Employee employee=session.get(Employee.class,id);
        session.delete(employee);
    }

    @Override
    @Transactional
    public Employee addEmployee(Employee employee) {
    Session session=entityManager.unwrap(Session.class);
    session.saveOrUpdate(employee);
    return employee;
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        Session session=entityManager.unwrap(Session.class);
        Employee employee= session.get(Employee.class,id);
        return employee;
    }


}
