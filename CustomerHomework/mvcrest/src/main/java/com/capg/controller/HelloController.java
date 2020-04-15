package com.capg.controller;

import com.capg.entities.Customer;
import com.capg.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    private static Logger Log= LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/find")
    public ModelAndView findPage() {
        return new ModelAndView("findcustomer");
    }


    @GetMapping("/processfindcust")
    public ModelAndView customerDetails(@RequestParam("custid")int custId) {
        Customer customer= customerService.findById(custId);
        return new ModelAndView("customerdetails", "customer", customer);
    }


    @GetMapping("/register")
    public ModelAndView registerPage() {
        return new ModelAndView("customerregister");// only provide view name
    }

    @GetMapping("/processregister")
    public ModelAndView registerEmployee(@RequestParam("custname") String custName) {
        Customer customer=new Customer();
        customer.setName(custName);
        customer=customerService.save(customer);
        return new ModelAndView("customerdetails",  "customer", customer);
    }





}
