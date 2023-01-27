package com.monitoring_employee.monitoring_employee.controller;

import com.monitoring_employee.monitoring_employee.entities.Employee;
import com.monitoring_employee.monitoring_employee.entities.Survey;
import com.monitoring_employee.monitoring_employee.services.EmployeeService;
import com.monitoring_employee.monitoring_employee.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilterController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/filter")
    public String viewFilter(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "filter";
    }


}


