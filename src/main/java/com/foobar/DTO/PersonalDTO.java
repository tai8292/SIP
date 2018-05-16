package com.foobar.DTO;

import com.foobar.HR.entities.Personal;

import java.util.Date;

public class PersonalDTO {

    private Integer personalID;

    private String firstName;

    private String lastName;

    private String middleInitial;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private Long zip;

    private String email;

    private String phoneNumber;

    private String ssn;

    private String driversLicense;

    private String matitalStatus;

    private boolean gender;

    private String shareholder;

    private BenefitPlanDTO benefitPlans;

    private Long benefitPlansID;

    private String enthnicity;

    private Date birthday;

    private EmploymentDTO employment;

    private int vacationDay;

    private double totalEarning;

    private double averageBenefit;

    public PersonalDTO() {
    }

    public PersonalDTO(Personal personal) {
        this.personalID = personal.getPersonalID();
        this.firstName = personal.getFirstName();
        this.lastName = personal.getLastName();
        this.middleInitial = personal.getMiddleInitial();
        this.address1 = personal.getAddress1();
        this.address2 = personal.getAddress2();
        this.city = personal.getCity();
        this.state = personal.getState();
        this.zip = personal.getZip();
        this.email = personal.getEmail();
        this.phoneNumber = personal.getPhoneNumber();
        this.ssn = personal.getSsn();
        this.driversLicense = personal.getDriversLicense();
        this.matitalStatus = personal.getMatitalStatus();
        this.gender = personal.isGender();
        this.shareholder = personal.getShareholder();
        this.benefitPlans = new BenefitPlanDTO(personal.getBenefitPlans());
        this.benefitPlansID = personal.getBenefitPlansID();
        this.enthnicity = personal.getEnthnicity();
        this.birthday = personal.getBirthday();
        this.employment = new EmploymentDTO(personal.getEmployment());
    }

    public PersonalDTO(Integer personalID, String firstName, String lastName, String middleInitial,
                       String address1, String address2, String city, String state, Long zip,
                       String email, String phoneNumber, String ssn, String driversLicense,
                       String matitalStatus, boolean gender, String shareholder, BenefitPlanDTO benefitPlans,
                       Long benefitPlansID, String enthnicity, Date birthday, EmploymentDTO employment) {
        this.personalID = personalID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.driversLicense = driversLicense;
        this.matitalStatus = matitalStatus;
        this.gender = gender;
        this.shareholder = shareholder;
        this.benefitPlans = benefitPlans;
        this.benefitPlansID = benefitPlansID;
        this.enthnicity = enthnicity;
        this.birthday = birthday;
        this.employment = employment;
    }

    public Integer getPersonalID() {
        return personalID;
    }

    public void setPersonalID(Integer personalID) {
        this.personalID = personalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getMatitalStatus() {
        return matitalStatus;
    }

    public void setMatitalStatus(String matitalStatus) {
        this.matitalStatus = matitalStatus;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getShareholder() {
        return shareholder;
    }

    public void setShareholder(String shareholder) {
        this.shareholder = shareholder;
    }

    public BenefitPlanDTO getBenefitPlans() {
        return benefitPlans;
    }

    public void setBenefitPlans(BenefitPlanDTO benefitPlans) {
        this.benefitPlans = benefitPlans;
    }

    public Long getBenefitPlansID() {
        return benefitPlansID;
    }

    public void setBenefitPlansID(Long benefitPlansID) {
        this.benefitPlansID = benefitPlansID;
    }

    public String getEnthnicity() {
        return enthnicity;
    }

    public void setEnthnicity(String enthnicity) {
        this.enthnicity = enthnicity;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public EmploymentDTO getEmployment() {
        return employment;
    }

    public void setEmployment(EmploymentDTO employment) {
        this.employment = employment;
    }

    public int getVacationDay() {
        return vacationDay;
    }

    public void setVacationDay(int vacationDay) {
        this.vacationDay = vacationDay;
    }

    public double getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(double totalEarning) {
        this.totalEarning = totalEarning;
    }

    public double getAverageBenefit() {
        return averageBenefit;
    }

    public void setAverageBenefit(double averageBenefit) {
        this.averageBenefit = averageBenefit;
    }
}
