package com.foobar.DTO;

import com.foobar.HR.entities.JobHistory;

import java.util.Date;

public class JobHistoryDTO {

    private long id;

    private PersonalDTO personal;

    private String department;

    private String division;

    private Date startDate;

    private Date endDate;

    private String jobTitle;

    private long supervisor;

    private String jobCategory;

    private String location;

    private long departmentCode;

    private long salaryType;

    private String payPeriod;

    private long hoursPerWeek;

    private boolean hazardousTrainning;

    public JobHistoryDTO() {
    }

    public JobHistoryDTO(JobHistory jobHistory)
    {
        this.id = jobHistory.getId();
        this.personal = new PersonalDTO(jobHistory.getPersonal());
        this.department = jobHistory.getDepartment();
        this.division = jobHistory.getDivision();
        this.startDate = jobHistory.getStartDate();
        this.endDate = jobHistory.getEndDate();
        this.jobTitle = jobHistory.getJobTitle();
        this.supervisor = jobHistory.getSupervisor();
        this.jobCategory = jobHistory.getJobCategory();
        this.location = jobHistory.getLocation();
        this.departmentCode = jobHistory.getDepartmentCode();
        this.salaryType = jobHistory.getSalaryType();
        this.payPeriod = jobHistory.getPayPeriod();
        this.hoursPerWeek = jobHistory.getHoursPerWeek();
        this.hazardousTrainning = jobHistory.isHazardousTrainning();
    }

    public JobHistoryDTO(long id, PersonalDTO personal, String department, String division,
                         Date startDate, Date endDate, String jobTitle, long supervisor,
                         String jobCategory, String location, long departmentCode, long salaryType,
                         String payPeriod, long hoursPerWeek, boolean hazardousTrainning) {
        this.id = id;
        this.personal = personal;
        this.department = department;
        this.division = division;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobTitle = jobTitle;
        this.supervisor = supervisor;
        this.jobCategory = jobCategory;
        this.location = location;
        this.departmentCode = departmentCode;
        this.salaryType = salaryType;
        this.payPeriod = payPeriod;
        this.hoursPerWeek = hoursPerWeek;
        this.hazardousTrainning = hazardousTrainning;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PersonalDTO getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalDTO personal) {
        this.personal = personal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(long supervisor) {
        this.supervisor = supervisor;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(long departmentCode) {
        this.departmentCode = departmentCode;
    }

    public long getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(long salaryType) {
        this.salaryType = salaryType;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public long getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(long hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public boolean isHazardousTrainning() {
        return hazardousTrainning;
    }

    public void setHazardousTrainning(boolean hazardousTrainning) {
        this.hazardousTrainning = hazardousTrainning;
    }
}
