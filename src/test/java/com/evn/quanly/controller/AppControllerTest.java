/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.evn.quanly.controller;

import com.evn.quanly.model.Customer;
import com.evn.quanly.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.ui.Model;

/**
 *
 * @author Lenovo
 */
public class AppControllerTest {
    
    public AppControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of viewHomePage method, of class AppController.
     */
    @Test
    public void testViewHomePage() {
        System.out.println("viewHomePage");
        AppController instance = new AppController();
        String expResult = "";
        String result = instance.viewHomePage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showRegistrationForm method, of class AppController.
     */
    @Test
    public void testShowRegistrationForm() {
        System.out.println("showRegistrationForm");
        Model model = null;
        AppController instance = new AppController();
        String expResult = "";
        String result = instance.showRegistrationForm(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processRegister method, of class AppController.
     */
    @Test
    public void testProcessRegister() {
        System.out.println("processRegister");
        User user = null;
        AppController instance = new AppController();
        String expResult = "";
        String result = instance.processRegister(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsers method, of class AppController.
     */
    @Test
    public void testListUsers() {
        System.out.println("listUsers");
        Model model = null;
        AppController instance = new AppController();
        String expResult = "";
        String result = instance.listUsers(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCustomerForm method, of class AppController.
     */
    @Test
    public void testShowCustomerForm() {
        System.out.println("showCustomerForm");
        Model model = null;
        AppController instance = new AppController();
        String expResult = "";
        String result = instance.showCustomerForm(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processCustomer method, of class AppController.
     */
    @Test
    public void testProcessCustomer() {
        System.out.println("processCustomer");
        Customer customer = null;
        AppController instance = new AppController();
        String expResult = "";
        String result = instance.processCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
