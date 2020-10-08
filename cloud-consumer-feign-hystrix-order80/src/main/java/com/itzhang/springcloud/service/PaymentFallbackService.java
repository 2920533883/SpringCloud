package com.itzhang.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "---- PaymentFallbackService fallback ok ----";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "---- PaymentFallbackService fallback timeout ----";
    }
}
