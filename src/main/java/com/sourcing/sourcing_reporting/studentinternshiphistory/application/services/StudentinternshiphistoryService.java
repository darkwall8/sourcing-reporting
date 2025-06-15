package com.sourcing.sourcing_reporting.studentinternshiphistory.application.services;

import com.sourcing.sourcing_reporting.studentinternshiphistory.application.ports.input.StudentinternshiphistoryUseCase;
import com.sourcing.sourcing_reporting.studentinternshiphistory.application.ports.output.StudentinternshiphistoryRepository;
import com.sourcing.sourcing_reporting.studentinternshiphistory.domain.model.Studentinternshiphistory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentinternshiphistoryService implements StudentinternshiphistoryUseCase {
    private final StudentinternshiphistoryRepository repository;

    public StudentinternshiphistoryService(StudentinternshiphistoryRepository repository) {
        this.repository = repository;
    }

    /**
     * To add a new internship to a user internship history
     * @param userId "A student ID"
     */
    @Override
    public void addStudentInternshipHistory(@RequestBody Studentinternshiphistory entity, @PathVariable String userId) {
        //
    }

    /**
     *To get student internship history
     * @param userId "A student ID"
     */
    @Override
    public void getStudentInternShipHistory(@PathVariable String userId) {
       //
    }

    /**
     * To get company received offer number
     *@param userId "A company ID"
     */
    @Override
    public void getCompanyOffersNumber(@PathVariable String userId){
        //
    }

    /**
     * To get company refused offers number
     *@param userId "A company ID"
     */
    @Override
    public void getCompanyRefusedOffersNumber(@PathVariable String userId){
        //
    }

    /**
     * To get company accepted offers number
     *@param userId "A company ID"
     */
    @Override
    public void getCompanyAcceptedOffersNumber(@PathVariable String userId){
        //
    }
}
