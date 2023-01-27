package com.monitoring_employee.monitoring_employee.controller;

import com.monitoring_employee.monitoring_employee.entities.Survey;
import com.monitoring_employee.monitoring_employee.services.SurveyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    private SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createSurvey(@RequestBody Survey survey) {
        surveyService.createSurvey(survey);
        return new ResponseEntity<>("Survey created successfully", HttpStatus.CREATED);
    }

    //localhost:8080/api/surveys/{empId}/update/{id}
    @PutMapping("/update/{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable Long empId, @PathVariable Long id, @RequestBody Survey survey) {
       Survey updateSurvey = surveyService.updateSurvey( id, survey);
        return new ResponseEntity<>(updateSurvey, HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Survey> viewSurvey(@PathVariable Long id) {
        Survey survey = surveyService.viewSurvey(id);
        return new ResponseEntity<>(survey, HttpStatus.OK);
    }
//    @GetMapping
//    public List<Survey> getAllEmployees() {
//        return surveyService.getAllSurveys();
//    }
}
