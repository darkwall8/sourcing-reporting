package com.sourcing.sourcing_reporting.studentinternshiphistory.application.ports.output;

import com.sourcing.sourcing_reporting.studentinternshiphistory.domain.model.Studentinternshiphistory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentinternshiphistoryRepository {
    //Studentinternshiphistory findById(Long id);
    public Studentinternshiphistory addStudentInternshipHistory(@RequestBody Studentinternshiphistory entity, @PathVariable String userId);
    public Studentinternshiphistory getStudentInternShipHistory(@PathVariable String userId);
    public Integer getCompanyOffersNumber(@PathVariable String userId);
    public Integer getCompanyRefusedOffersNumber(@PathVariable String userId);
    public Integer getCompanyAcceptedOffersNumber(@PathVariable String userId);
}
