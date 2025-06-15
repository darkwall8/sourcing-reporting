package com.sourcing.sourcing_reporting.studentinternshiphistory.application.ports.input;

import com.sourcing.sourcing_reporting.studentinternshiphistory.domain.model.Studentinternshiphistory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentinternshiphistoryUseCase {
    void addStudentInternshipHistory(@RequestBody Studentinternshiphistory entity, @PathVariable String userId);
    void getStudentInternShipHistory(@PathVariable String userId);
    void getCompanyOffersNumber(@PathVariable String userId);
    void getCompanyRefusedOffersNumber(@PathVariable String userId);
    void getCompanyAcceptedOffersNumber(@PathVariable String userId);
}
