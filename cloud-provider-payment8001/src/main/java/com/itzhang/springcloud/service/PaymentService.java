package com.itzhang.springcloud.service;

import com.itzhang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
