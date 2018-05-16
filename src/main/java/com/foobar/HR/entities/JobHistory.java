package com.foobar.HR.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Job_History")
public class JobHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @ManyToOne
    @JoinColumn(name ="Employee_ID")
    private Personal personal;

    @Column(name = "Department")
    private String department;

    @Column(name = "Division")
    private String division;

    @Column(name = "Start_Date")
    private Date startDate;

    @Column(name = "End_Date")
    private Date endDate;

    @Column(name = "Job_Title")
    private String jobTitle;

    @Column(name = "Supervisor")
    private long supervisor;

    @Column(name = "Job_Category")
    private String jobCategory;

    @Column(name = "Location")
    private String location;

    @Column(name = "Department_Code")
    private long departmentCode;

    @Column(name = "Salary_Type")
    private long salaryType;

    @Column(name = "Pay_Period")
    private String payPeriod;

    @Column(name = "Hours_per_Week")
    private long hoursPerWeek;

    @Column(name = "Hazardous_Training")
    private boolean hazardousTrainning;

    public JobHistory() {
    }

    public JobHistory(Personal personal, String department, String division, Date startDate,
                      Date endDate, String jobTitle, long supervisor, String jobCategory,
                      String location, long departmentCode, long salaryType, String payPeriod,
                      long hoursPerWeek, boolean hazardousTrainning) {
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

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
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

    @Override
    public String toString() {
        return "JobHistory{" +
                "id=" + id +
                ", personal=" + personal +
                ", department='" + department + '\'' +
                ", division='" + division + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", jobTitle='" + jobTitle + '\'' +
                ", supervisor=" + supervisor +
                ", jobCategory='" + jobCategory + '\'' +
                ", location='" + location + '\'' +
                ", departmentCode=" + departmentCode +
                ", salaryType=" + salaryType +
                ", payPeriod='" + payPeriod + '\'' +
                ", hoursPerWeek=" + hoursPerWeek +
                ", hazardousTrainning=" + hazardousTrainning +
                '}';
    }
}
