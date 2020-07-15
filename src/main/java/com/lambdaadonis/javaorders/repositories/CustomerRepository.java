package com.lambdaadonis.javaorders.repositories;

import com.lambdaadonis.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByCustnameContainingIgnoringCase(String name);

    Customer findByCustname(String name);



    List<OrderCounts> getOrderCounts();

}
