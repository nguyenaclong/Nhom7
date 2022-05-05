/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evn.quanly.service;

import com.evn.quanly.model.Customer;
import com.evn.quanly.repository.CustomerRepository;
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
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;
    
    public List<Customer> listAll(){
        return (List<Customer>) customerRepo.findAll();
    }
    
    public void save(Customer customer){
        customerRepo.save(customer);
    }
    
    public Customer get(Long id){
        return customerRepo.findById(id).get();
    }
    
    public void delete(Long id){
        customerRepo.deleteById(id);
    }
    
}
