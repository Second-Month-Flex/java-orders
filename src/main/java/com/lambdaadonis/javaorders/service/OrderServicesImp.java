package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Order;
import com.lambdaadonis.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "orderService")
public class OrderServicesImp implements OrderServices{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findById(long id) {
        return orderRepository.findById(id)
                .orElseThrow(()->  new EntityNotFoundException("Order id " + id + " not Found!"));
    }
}
