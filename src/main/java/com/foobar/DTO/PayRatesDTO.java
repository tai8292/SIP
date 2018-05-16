package com.foobar.DTO;

public class PayRatesDTO {

    private int idPayRates;

    private String payRateName;

    private int value;

    private int taxPercentage;

    private int payType;

    private int payAmount;

    private int PT;

    public PayRatesDTO() {
    }

    public PayRatesDTO(int idPayRates, String payRateName, int value, int taxPercentage,
                       int payType, int payAmount, int PT) {
        this.idPayRates = idPayRates;
        this.payRateName = payRateName;
        this.value = value;
        this.taxPercentage = taxPercentage;
        this.payType = payType;
        this.payAmount = payAmount;
        this.PT = PT;
    }

    public int getIdPayRates() {
        return idPayRates;
    }

    public void setIdPayRates(int idPayRates) {
        this.idPayRates = idPayRates;
    }

    public String getPayRateName() {
        return payRateName;
    }

    public void setPayRateName(String payRateName) {
        this.payRateName = payRateName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    public int getPT() {
        return PT;
    }

    public void setPT(int PT) {
        this.PT = PT;
    }
}
