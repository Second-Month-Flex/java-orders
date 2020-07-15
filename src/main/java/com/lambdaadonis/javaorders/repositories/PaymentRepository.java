package com.lambdaadonis.javaorders.repositories;

import com.lambdaadonis.javaorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
