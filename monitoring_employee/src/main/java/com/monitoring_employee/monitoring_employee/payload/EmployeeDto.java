package com.monitoring_employee.monitoring_employee.payload;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public class EmployeeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String role;
    private long happinessLevel;
    private long satisfactionLevel;
    private String comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
