package com.monitoring_employee.monitoring_employee.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

}
