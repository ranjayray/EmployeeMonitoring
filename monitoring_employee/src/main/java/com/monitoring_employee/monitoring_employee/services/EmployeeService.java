package com.monitoring_employee.monitoring_employee.services;

import com.monitoring_employee.monitoring_employee.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public void createEmployee(Employee employee);

    public Employee updateEmployee(long id, Employee employee);

    public Employee viewEmployee(Long id);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(Long id);

}

