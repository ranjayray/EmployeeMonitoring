package com.monitoring_employee.monitoring_employee.services.Impl;

import com.monitoring_employee.monitoring_employee.entities.Survey;
import com.monitoring_employee.monitoring_employee.exception.ResourceNotFoundException;
import com.monitoring_employee.monitoring_employee.repository.SurveyRepository;
import com.monitoring_employee.monitoring_employee.services.SurveyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServicesImpl implements SurveyService {

    private SurveyRepository surveyRepository;
    @Override
    public void createSurvey(Survey survey) {
        surveyRepository.save(survey);
    }

    @Override
    public Survey updateSurvey(Long id, Survey survey) {
        Survey existingSurvey = surveyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Survey", "id", id));
        existingSurvey.setEmployee(survey.getEmployee());
        existingSurvey.setDate(survey.getDate());
        existingSurvey.setQuestions(survey.getQuestions());
        surveyRepository.save(existingSurvey);
        return existingSurvey;
    }

    @Override
    public Survey viewSurvey(Long id) {
        return surveyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Survey", "id", id));
    }

    @Override
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }
}
