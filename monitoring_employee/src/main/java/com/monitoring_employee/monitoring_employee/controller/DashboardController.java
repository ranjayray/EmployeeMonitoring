package com.monitoring_employee.monitoring_employee.controller;

import com.monitoring_employee.monitoring_employee.entities.Survey;
import com.monitoring_employee.monitoring_employee.services.SurveyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    private SurveyService surveyService;

    public DashboardController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    //localhost:8080/dashboard/surveys
    @GetMapping("/surveys")
    public String viewSurveyResults(Model model) {
        List<Survey> surveys = surveyService.getAllSurveys();
        model.addAttribute("surveys", surveys);
        return "dashboard";
    }
}

