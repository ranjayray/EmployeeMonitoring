package com.monitoring_employee.monitoring_employee.repository;

import com.monitoring_employee.monitoring_employee.entities.Employee;
import com.monitoring_employee.monitoring_employee.entities.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

//    public List<Survey> findById(long empId);
//
//    public List<Survey> findByDate(LocalDate date);
//
//    @Query("SELECT s FROM Survey s WHERE s.employee = :employee and s.date >= :startDate and s.date <= :endDate")
//    public List<Survey> findByEmployeeAndDateRange(@Param("employee") Employee employee,
//                                                   @Param("startDate") LocalDate startDate,
//                                                   @Param("endDate") LocalDate endDate);

}
