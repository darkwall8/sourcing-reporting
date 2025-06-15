package com.sourcing.sourcing_reporting.studentinternshiphistory.infrastructure.adapters.input;

import com.sourcing.sourcing_reporting.studentinternshiphistory.application.services.StudentinternshiphistoryService;
import com.sourcing.sourcing_reporting.studentinternshiphistory.domain.model.Studentinternshiphistory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student_internship_history")
public class StudentinternshiphistoryController {

    private final StudentinternshiphistoryService service;

    public StudentinternshiphistoryController(StudentinternshiphistoryService service) {

        this.service = service;
    }

    /**
     * To add a new internship to a user internship history
     * @param userId "A student ID"
     */
    @PostMapping("/add_student_internship_to_history/{userId}")
    public void addStudentInternshipHistory(@RequestBody Studentinternshiphistory entity, @PathVariable String userId) {
        service.addStudentInternshipHistory(entity, userId);
    }

    /**
     *To get student internship history
     * @param userId "A student ID"
     */
    @GetMapping("/get_student_internship_history/{userId}")
    public void getStudentInternShipHistory(@PathVariable String userId) {
        service.getStudentInternShipHistory(userId);
    }

    /**
     * To get company received offer number
     *@param userId "A company ID"
     */
    @GetMapping("/get_company_offers_number/{userId}")
    public void getCompanyOffersNumber(@PathVariable String userId){
        service.getCompanyOffersNumber(userId);
    }

    /**
     * To get company refused offers number
     *@param userId "A company ID"
     */
    @GetMapping("/get_company_refused_offers_number/{userId}")
    public void getCompanyRefusedOffersNumber(@PathVariable String userId){
        service.getCompanyRefusedOffersNumber(userId);
    }

    /**
     * To get company accepted offers number
     *@param userId "A company ID"
     */
    @GetMapping("/get_company_accepted_offers_number/{userId}")
    public void getCompanyAcceptedOffersNumber(@PathVariable String userId){
        service.getCompanyAcceptedOffersNumber(userId);
    }
}
