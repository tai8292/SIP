package com.vibuff.ihuney.entities;

import javax.persistence.*;

@Entity
@Table(name = "Benefit_Plans")
public class BenefitPlans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Benefit_Plan_ID")
    private long benefitPlanID;

    @Column(name = "Plan_Name")
    private String planName;

    @Column(name = "Deductable")
    private long deductable;

    @Column(name = "Percentage_CoPay")
    private int percentageCoPay;

    public BenefitPlans() {
    }

    public BenefitPlans(String planName, long deductable, int percentageCoPay) {
        this.planName = planName;
        this.deductable = deductable;
        this.percentageCoPay = percentageCoPay;
    }

    public long getBenefitPlanID() {
        return benefitPlanID;
    }

    public void setBenefitPlanID(long benefitPlanID) {
        this.benefitPlanID = benefitPlanID;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public long getDeductable() {
        return deductable;
    }

    public void setDeductable(long deductable) {
        this.deductable = deductable;
    }

    public int getPercentageCoPay() {
        return percentageCoPay;
    }

    public void setPercentageCoPay(int percentageCoPay) {
        this.percentageCoPay = percentageCoPay;
    }

    @Override
    public String toString() {
        return "BenefitPlans{" +
                "benefitPlanID=" + benefitPlanID +
                ", planName='" + planName + '\'' +
                ", deductable=" + deductable +
                ", percentageCoPay=" + percentageCoPay +
                '}';
    }
}
