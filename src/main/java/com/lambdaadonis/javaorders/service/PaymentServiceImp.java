package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Payment;
import com.lambdaadonis.javaorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentService")
public class PaymentServiceImp implements PaymentServices{

    @Autowired
    private PaymentRepository paymentRepository;


    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
