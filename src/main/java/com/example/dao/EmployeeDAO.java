package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {

    @Autowired
    EmployeeRepository employeeRepository;

    /* to save an employee */
    public Employee save(Employee empl){
        return employeeRepository.save(empl);
    }

    /* search all employee */
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    /*get an employee by id*/
    public Employee findOne(Long empId) {
        return employeeRepository.getOne(empId);
    }

    /* delete an employee*/
    public void delete(Employee empl){
        employeeRepository.delete(empl);
    }

}
