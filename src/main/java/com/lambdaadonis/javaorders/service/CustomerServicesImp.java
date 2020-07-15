package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Customer;
import com.lambdaadonis.javaorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServicesImp implements CustomerServices{
@Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> AllCustOrder() {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findById(long id) {
        return customerRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Customer Order " + id + "Not found"));
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByCustnameContainingIgnoringCase(name);
    }

    @Override
    public Customer FindBySingleName(String name) {
        Customer C = customerRepository.findByCustname(name);

        if (C == null)
        {
            throw new EntityNotFoundException("Customer " + name + " not found!");
        }
        return C ;
    }

}
