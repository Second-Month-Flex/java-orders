package com.lambdaadonis.javaorders.controller;


import com.lambdaadonis.javaorders.models.Order;
import com.lambdaadonis.javaorders.service.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderServices orderServices;
//    http://localhost:2019/orders/order/7
    @GetMapping(value = "order/{id}", produces = "application/json")
    public ResponseEntity<?> findById(@PathVariable long id){
        Order O = orderServices.findById(id);
        return new ResponseEntity<>(O, HttpStatus.OK);
    }

}
