package com.monitoring_employee.monitoring_employee.services;

import com.monitoring_employee.monitoring_employee.entities.Survey;

import java.util.List;

public interface SurveyService {

    public void createSurvey(Survey survey);

    public Survey updateSurvey(Long id, Survey survey);

    public Survey viewSurvey(Long id);

    public List<Survey> getAllSurveys();


}
