package com.foobar.DTO;

import com.foobar.HR.entities.Employment;

import java.util.Date;

public class EmploymentDTO {

    private Integer personalID;

    private String employmentStatus;

    private Date hireDate;

    private String workersCompCode;

    private Date terminationDate;

    private Date rehireDate;

    private Date lastReviewDate;

    public EmploymentDTO() {
    }

    public EmploymentDTO(Employment employment) {
        this.personalID = employment.getPersonalID();
        this.employmentStatus = employment.getEmploymentStatus();
        this.hireDate = employment.getHireDate();
        this.workersCompCode = employment.getWorkersCompCode();
        this.terminationDate = employment.getTerminationDate();
        this.rehireDate = employment.getRehireDate();
        this.lastReviewDate = employment.getLastReviewDate();
    }

    public EmploymentDTO(Integer personalID, String employmentStatus, Date hireDate,
                         String workersCompCode, Date terminationDate, Date rehireDate,
                         Date lastReviewDate) {
        this.personalID = personalID;
        this.employmentStatus = employmentStatus;
        this.hireDate = hireDate;
        this.workersCompCode = workersCompCode;
        this.terminationDate = terminationDate;
        this.rehireDate = rehireDate;
        this.lastReviewDate = lastReviewDate;
    }

    public Integer getPersonalID() {
        return personalID;
    }

    public void setPersonalID(Integer personalID) {
        this.personalID = personalID;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getWorkersCompCode() {
        return workersCompCode;
    }

    public void setWorkersCompCode(String workersCompCode) {
        this.workersCompCode = workersCompCode;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public Date getRehireDate() {
        return rehireDate;
    }

    public void setRehireDate(Date rehireDate) {
        this.rehireDate = rehireDate;
    }

    public Date getLastReviewDate() {
        return lastReviewDate;
    }

    public void setLastReviewDate(Date lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }


}
