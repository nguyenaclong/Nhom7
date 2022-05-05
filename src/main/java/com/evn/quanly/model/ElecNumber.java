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
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "ElecNumber")
public class ElecNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Elec_Id", nullable = false)
    private Long eNumId;

    @JoinColumn(name = "Customer_Id", referencedColumnName = "Customer_Id")
    @ManyToOne
    private Customer customer;

    @Column(name = "Old_Num")
    private int oldNum;

    @Column(name = "Old_Num_Date")
    private Date oldDate;

    @Column(name = "New_Num")
    private int newNum;

    @Column(name = "New_Num_Date")
    private Date newDate;

    @Column(name = "Recorded_Date")
    private Date recordedDate;

    public ElecNumber() {
    }

    public ElecNumber(Long eNumId, Customer customer, int oldNum, Date oldDate, int newNum, Date newDate, Date recordedDate) {
        this.eNumId = eNumId;
        this.customer = customer;
        this.oldNum = oldNum;
        this.oldDate = oldDate;
        this.newNum = newNum;
        this.newDate = newDate;
        this.recordedDate = recordedDate;
    }

    public Long geteNumId() {
        return eNumId;
    }

    public void seteNumId(Long eNumId) {
        this.eNumId = eNumId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldNum() {
        return oldNum;
    }

    public void setOldNum(int oldNum) {
        this.oldNum = oldNum;
    }

    public Date getOldDate() {
        return oldDate;
    }

    public void setOldDate(Date oldDate) {
        this.oldDate = oldDate;
    }

    public int getNewNum() {
        return newNum;
    }

    public void setNewNum(int newNum) {
        this.newNum = newNum;
    }

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    public Date getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(Date recordedDate) {
        this.recordedDate = recordedDate;
    }

}
