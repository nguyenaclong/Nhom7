/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evn.quanly.controller;

import com.evn.quanly.model.Customer;
import com.evn.quanly.model.User;
import com.evn.quanly.repository.UserRepository;
import com.evn.quanly.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lenovo
 */
@Controller
public class AppController {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/index")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

    @GetMapping("/customer")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/process_customer")
    public String processCustomer(Customer customer) {
        customerService.save(customer);

        return "customer_success";
    }
    
    @GetMapping("/calculator")
    public String showCalculatorForm(Model model){
        return "calculator";
    }
}
