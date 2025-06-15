package com.sourcing.sourcing_reporting.studentinternshiphistory.infrastructure.adapters.output;

import com.sourcing.sourcing_reporting.studentinternshiphistory.application.ports.output.StudentinternshiphistoryRepository;
import com.sourcing.sourcing_reporting.studentinternshiphistory.domain.model.Studentinternshiphistory;
import org.springframework.stereotype.Repository;

@Repository
public class StudentinternshiphistoryRepositoryImpl implements StudentinternshiphistoryRepository {

    /**
     * @param entity 
     * @param userId "The student ID"
     * @return
     */
    @Override
    public Studentinternshiphistory addStudentInternshipHistory(Studentinternshiphistory entity, String userId) {
        return null;
    }

    /**
     * @param userId "The student ID"
     * @return
     */
    @Override
    public Studentinternshiphistory getStudentInternShipHistory(String userId) {
        return null;
    }

    /**
     * @param userId "The company ID"
     * @return
     */
    @Override
    public Integer getCompanyOffersNumber(String userId) {
        return 0;
    }

    /**
     * @param userId "The company ID"
     * @return
     */
    @Override
    public Integer getCompanyRefusedOffersNumber(String userId) {
        return 0;
    }

    /**
     * @param userId "The company ID"
     * @return
     */
    @Override
    public Integer getCompanyAcceptedOffersNumber(String userId) {
        return 0;
    }

}
