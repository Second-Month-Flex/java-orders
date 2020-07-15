package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Customer;

import java.util.List;

public interface CustomerServices {

    Customer save(Customer customer);

    List<Customer> AllCustOrder();


    Customer findById(long id);


    List<Customer> findByName(String name);

    Customer FindBySingleName(String name);




}
