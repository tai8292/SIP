package com.foobar.PoJo;

import java.util.Date;

public class Filder {

    private Boolean shareHolder;
    private boolean gender;
    private String ethnic;
    private String status;
    private String department;
    private Date formDate;
    private Date toDate;

    public Boolean getShareHolder() {
        return shareHolder;
    }

    public void setShareHolder(Boolean shareHolder) {
        this.shareHolder = shareHolder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public Date getFormDate() {
        return formDate;
    }

    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
