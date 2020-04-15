package com.capg.service;

import com.capg.entities.Customer;


import java.util.List;

public interface ICustomerService {
    Customer findById(int id);

    Customer save(Customer user);


    List<Customer> fetchAll();

    boolean remove(int id);




}
