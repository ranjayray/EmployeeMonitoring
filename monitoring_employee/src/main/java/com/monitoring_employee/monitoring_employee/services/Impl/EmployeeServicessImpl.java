package com.monitoring_employee.monitoring_employee.services.Impl;

import com.monitoring_employee.monitoring_employee.entities.Employee;
import com.monitoring_employee.monitoring_employee.exception.ResourceNotFoundException;
import com.monitoring_employee.monitoring_employee.repository.EmployeeRepository;
import com.monitoring_employee.monitoring_employee.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicessImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServicessImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setRole(employee.getRole());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setDesignation(employee.getDesignation());
        existingEmployee.setHappinessLevel(employee.getHappinessLevel());
        existingEmployee.setSatisfactionLevel(employee.getSatisfactionLevel());
        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public Employee viewEmployee(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee == null) {
            throw new ResourceNotFoundException("Employee", "id", id);
        }
        employeeRepository.delete(employee);
    }
}
