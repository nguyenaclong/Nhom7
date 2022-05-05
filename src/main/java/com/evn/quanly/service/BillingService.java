/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evn.quanly.service;

import com.evn.quanly.model.Billing;
import com.evn.quanly.repository.BillingRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
@Transactional
public class BillingService {

    @Autowired
    private BillingRepository billingRepo;

    public List<Billing> listAll() {
        return (List<Billing>) billingRepo.findAll();
    }

    public void save(Billing billing) {
        billingRepo.save(billing);
    }

    public Billing get(Long id) {
        return billingRepo.findById(id).get();
    }

    public void delete(Long id) {
        billingRepo.deleteById(id);
    }
}
