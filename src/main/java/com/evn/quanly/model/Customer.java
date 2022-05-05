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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id", nullable = false)
    private Long customerId;

    @Column(name = "Customer_Name", length = 255, nullable = false)
    private String customerName;

    @Column(name = "Address", length = 255, nullable = false)
    private String address;

    @Column(name = "CCCD", length = 12, nullable = false)
    private String cccd;

    @Column(name = "Birth_Date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "Phone", length = 12, nullable = false)
    private String customerPhone;

    @Column(name = "Customer_Email", length = 255, nullable = false)
    private String email;

    @Column(name = "CCCD_Date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date cccdDate;

    @Column(name = "CCCD_Place", length = 255, nullable = false)
    private String cccdPlace;

    @Column(name = "Elec_Address", length = 255, nullable = false)
    private String elecAddress;

    @Column(name = "Elec_Phase", length = 3, nullable = false)
    private String elecPhase;

    public Customer() {
    }

    public Customer(Long customerId, String customerName, String address, String cccd, Date birthDate, String customerPhone, String email, Date cccdDate, String cccdPlace, String elecAddress, String elecPhase) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.cccd = cccd;
        this.birthDate = birthDate;
        this.customerPhone = customerPhone;
        this.email = email;
        this.cccdDate = cccdDate;
        this.cccdPlace = cccdPlace;
        this.elecAddress = elecAddress;
        this.elecPhase = elecPhase;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCccdDate() {
        return cccdDate;
    }

    public void setCccdDate(Date cccdDate) {
        this.cccdDate = cccdDate;
    }

    public String getCccdPlace() {
        return cccdPlace;
    }

    public void setCccdPlace(String cccdPlace) {
        this.cccdPlace = cccdPlace;
    }

    public String getElecAddress() {
        return elecAddress;
    }

    public void setElecAddress(String elecAddress) {
        this.elecAddress = elecAddress;
    }

    public String getElecPhase() {
        return elecPhase;
    }

    public void setElecPhase(String elecPhase) {
        this.elecPhase = elecPhase;
    }

}
