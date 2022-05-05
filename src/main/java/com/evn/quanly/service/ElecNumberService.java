/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evn.quanly.service;

import com.evn.quanly.model.ElecNumber;
import com.evn.quanly.repository.ElecNumberRepository;
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
public class ElecNumberService {

    @Autowired
    private ElecNumberRepository elecNumberRepo;

    public List<ElecNumber> listAll() {
        return (List<ElecNumber>) elecNumberRepo.findAll();
    }

    public void save(ElecNumber elecNumber) {
        elecNumberRepo.save(elecNumber);
    }

    public ElecNumber get(Long id) {
        return elecNumberRepo.findById(id).get();
    }

    public void delete(Long id) {
        elecNumberRepo.deleteById(id);
    }
}
