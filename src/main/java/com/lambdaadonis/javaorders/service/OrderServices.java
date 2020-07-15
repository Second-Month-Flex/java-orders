package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Order;

public interface OrderServices {

    Order save(Order order);

    Order findById(long id);
}
