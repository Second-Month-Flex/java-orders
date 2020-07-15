package com.lambdaadonis.javaorders.controller;

import com.lambdaadonis.javaorders.models.Customer;
import com.lambdaadonis.javaorders.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

//    http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> listAll(){
        List<Customer> list = customerServices.AllCustOrder();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

//    http://localhost:2019/customers/customer/7
//    http://localhost:2019/customers/customer/77
    @GetMapping(value ="/customer/{id}", produces = "application/json")
    public ResponseEntity<?> findById(@PathVariable long id){
        Customer C = customerServices.findById(id);
        return new ResponseEntity<>(C, HttpStatus.OK);
    }

//    http://localhost:2019/customers/namelike/mes
//    http://localhost:2019/customers/namelike/cin
    @GetMapping(value = "namelike/{name}", produces = "application/json")
    public ResponseEntity<?> ListWithThisName (@PathVariable String name){
        List<Customer> list = customerServices.findByName(name);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

// all customers with number of orders they have placed
//    http://localhost:2019/customers/orders/count
    @GetMapping(value = "orders/count", produces = "application/json")
    public ResponseEntity<?> Combinedordersandcustomers(){

    }

}
