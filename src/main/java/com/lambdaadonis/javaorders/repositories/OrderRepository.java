package com.lambdaadonis.javaorders.repositories;

import com.lambdaadonis.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <Order,Long> {
}
