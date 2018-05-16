package com.foobar.DTO;

import com.foobar.HR.entities.BenefitPlans;

public class BenefitPlanDTO {

    private long benefitPlanID;

    private String planName;

    private long deductable;

    private int percentageCoPay;

    public BenefitPlanDTO() {
    }

    public BenefitPlanDTO(BenefitPlans benefitPlans) {
        this.benefitPlanID = benefitPlans.getBenefitPlanID();
        this.planName = benefitPlans.getPlanName();
        this.deductable = benefitPlans.getDeductable();
        this.percentageCoPay = benefitPlans.getPercentageCoPay();
    }

    public BenefitPlanDTO(long benefitPlanID, String planName, long deductable, int percentageCoPay) {
        this.benefitPlanID = benefitPlanID;
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
}
