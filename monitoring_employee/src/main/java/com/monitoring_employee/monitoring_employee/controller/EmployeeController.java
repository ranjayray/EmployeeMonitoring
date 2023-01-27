package com.monitoring_employee.monitoring_employee.controller;

import com.monitoring_employee.monitoring_employee.entities.Employee;
import com.monitoring_employee.monitoring_employee.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return new ResponseEntity<>("Employee created successfully", HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Employee emp = employeeService.updateEmployee(id, employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Employee> viewEmployee(@PathVariable Long id) {
        Employee employee = employeeService.viewEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>  deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Post Entity Deleted Successfully", HttpStatus.OK);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}

