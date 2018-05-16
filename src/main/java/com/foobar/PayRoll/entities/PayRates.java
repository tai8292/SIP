package com.foobar.PayRoll.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;

@Entity
@Table(name = "Pay_Rates")
public class PayRates {

    @Id
    @Column(name = "id_Pay_Rates")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPayRates;

    @Column(name = "Pay_Rate_Name")
    private String payRateName;

    @Column(name = "Value")
    private int value;

    @Column(name = "Tax_Percentage")
    private int taxPercentage;

    @Column(name = "Pay_Type")
    private int payType;

    @Column(name = "Pay_Amount")
    private int payAmount;

    @Column(name = "PTLevelC")
    private int PT;

    public PayRates() {
    }

    public PayRates(String payRateName, int value, int taxPercentage, int payType, int payAmount, int PT) {
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
