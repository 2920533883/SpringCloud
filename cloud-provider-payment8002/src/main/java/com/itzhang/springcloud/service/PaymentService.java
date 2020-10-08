package com.itzhang.springcloud.service;

import com.itzhang.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
