package com.gyf.szcrm.model;

public class MonthIncome {
    private String date;//y月份
    private String total;//每月总订单
    private String income;//每月总收入


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
