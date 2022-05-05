/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evn.quanly.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Billing")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bill_Id", nullable = false)
    private Long billId;

    @JoinColumn(name = "Customer_Id", referencedColumnName = "Customer_Id")
    @ManyToOne
    private Customer customer;

    @JoinColumn(name = "Elec_Number_Id", referencedColumnName = "Elec_Id")
    @OneToOne
    private ElecNumber elecNum;

    @Column(name = "Total_Amount")
    private Long total;

    @Column(name = "Billing_Date")
    private Date billingDate;

    @JoinColumn(name = "Account_Id", referencedColumnName = "id")
    @ManyToOne
    private User user;

    public Billing() {
    }

    public Billing(Long billId, Customer customer, ElecNumber elecNum, Long total, Date billingDate, User user) {
        this.billId = billId;
        this.customer = customer;
        this.elecNum = elecNum;
        this.total = total;
        this.billingDate = billingDate;
        this.user = user;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ElecNumber getElecNum() {
        return elecNum;
    }

    public void setElecNum(ElecNumber elecNum) {
        this.elecNum = elecNum;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
