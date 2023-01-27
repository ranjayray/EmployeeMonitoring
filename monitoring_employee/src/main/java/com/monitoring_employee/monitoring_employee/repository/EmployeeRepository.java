package com.monitoring_employee.monitoring_employee.repository;

import com.monitoring_employee.monitoring_employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
