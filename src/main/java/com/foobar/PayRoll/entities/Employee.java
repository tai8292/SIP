package com.foobar.PayRoll.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "Employee")
public class Employee {


    @Id
    @Column(name = "Employee_Number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeNumber;
    @Column(name = "id_Employee")
    private Integer idEmployee;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "SSN")
    private Number SSN;

    @Column(name = "Pay_Rate")
    private String payRate;

    @OneToOne
    @JoinColumn(name = "pay_rates_id_pay_rates")
    private PayRates payRates;

    @Column(name = "Vacation_Days")
    private int vacationDays;

    @Column(name = "Paid_To_Date")
    private int paidToDate;

    @Column(name = "Paid_To_Year")
    private int paidToYear;

    public Employee() {
    }

    public Employee(Integer idEmployee, String lastName, String firstName, Number SSN, String payRate,
                    PayRates payRates, int vacationDays, int paidToDate, int paidToYear) {
        this.idEmployee = idEmployee;
        this.lastName = lastName;
        this.firstName = firstName;
        this.SSN = SSN;
        this.payRate = payRate;
        this.payRates = payRates;
        this.vacationDays = vacationDays;
        this.paidToDate = paidToDate;
        this.paidToYear = paidToYear;
    }

    public Employee(Integer idEmployee,int vacationDays) {
        this.idEmployee = idEmployee;
        this.vacationDays = vacationDays;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Number getSSN() {
        return SSN;
    }

    public void setSSN(Number SSN) {
        this.SSN = SSN;
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public PayRates getPayRates() {
        return payRates;
    }

    public void setPayRates(PayRates payRates) {
        this.payRates = payRates;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getPaidToDate() {
        return paidToDate;
    }

    public void setPaidToDate(int paidToDate) {
        this.paidToDate = paidToDate;
    }

    public int getPaidToYear() {
        return paidToYear;
    }

    public void setPaidToYear(int paidToYear) {
        this.paidToYear = paidToYear;
    }
}
