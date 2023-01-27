package com.monitoring_employee.monitoring_employee.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String designation;

    @Column(nullable = false)
    private String role;

    @Column(name = "happiness_level", nullable = false)

    private long happinessLevel;

    @Column(name = "satisfaction_level", nullable = false)

    private long satisfactionLevel;
    private String comments;

    @Column(name = "created_at", nullable = false)

    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)

    private LocalDateTime updatedAt;

}

