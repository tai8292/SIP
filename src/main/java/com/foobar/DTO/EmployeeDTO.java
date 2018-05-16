package com.foobar.DTO;

public class EmployeeDTO {


    private Integer employeeNumber;

    private Integer idEmployee;

    private String lastName;

    private String firstName;

    private Number SSN;

    private String payRate;

    private PayRatesDTO payRates;

    private int vacationDays;

    private int paidToDate;

    private int paidToYear;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer employeeNumber, Integer idEmployee, String lastName,
                       String firstName, Number SSN, String payRate, PayRatesDTO payRates,
                       int vacationDays, int paidToDate, int paidToYear) {
        this.employeeNumber = employeeNumber;
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

    public PayRatesDTO getPayRates() {
        return payRates;
    }

    public void setPayRates(PayRatesDTO payRates) {
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
