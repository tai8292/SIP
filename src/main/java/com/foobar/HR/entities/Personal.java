package com.foobar.HR.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_ID")
    Integer personalID;

    @Column(name = "First_name")
    private String firstName;

    @Column(name = "Last_name")
    private String lastName;

    @Column(name = "Middle_Initial")
    private String middleInitial;

    @Column(name = "Address1")
    private String address1;

    @Column(name = "Address2")
    private String address2;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Zip")
    private Long zip;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone_Number")
    private String phoneNumber;

    @Column(name = "Social_Security_Number")
    private String ssn;

    @Column(name = "Drivers_License")
    private String driversLicense;

    @Column(name = "Matital_Status")
    private String matitalStatus;

    @Column(name = "Gender")
    private boolean gender;

    @Column(name = "Shareholder_Status")
    private String shareholder;

    @ManyToOne
    @JoinColumn(name ="Benefit_Plan")
    private BenefitPlans benefitPlans;

    @Column(name ="Benefit_Plan_ID")
    private Long benefitPlansID;

    @Column(name = "Enthnicity")
    private String enthnicity;

    @Column(name = "Birthday")
    private Date birthday;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Employment employment;


    public Personal() {
    }

    public Personal(Integer id,String firstName, String phoneNumber, String shareholder, Date birthday) {
        this.personalID = id;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.shareholder = shareholder;
        this.birthday = birthday;
        Date d = new Date();
        this.address2 = ""+ Math.abs(d.getYear() - birthday.getYear() )  ;
    }

    public Personal(String firstName, String lastName, String middleInitial, String address1,
                    String address2, String city, String state, Long zip, String email, String phoneNumber,
                    String ssn, String driversLicense, String matitalStatus, boolean gender, String shareholder,
                    BenefitPlans benefitPlans, Long benefitPlansID, String enthnicity, Date birthday,
                    Employment employment) {
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

    public BenefitPlans getBenefitPlans() {
        return benefitPlans;
    }

    public void setBenefitPlans(BenefitPlans benefitPlans) {
        this.benefitPlans = benefitPlans;
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

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Long getBenefitPlansID() {
        return benefitPlansID;
    }

    public void setBenefitPlansID(Long benefitPlansID) {
        this.benefitPlansID = benefitPlansID;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "employeeID=" + personalID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", address1='" + address1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", driversLicense='" + driversLicense + '\'' +
                ", matitalStatus='" + matitalStatus + '\'' +
                ", gender=" + gender +
                ", shareholder='" + shareholder + '\'' +
                ", benefitPlans=" + benefitPlans +
                ", enthnicity='" + enthnicity + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
