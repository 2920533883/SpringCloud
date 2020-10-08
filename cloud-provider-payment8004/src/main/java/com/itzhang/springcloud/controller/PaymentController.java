package com.itzhang.springcloud.controller;

import com.itzhang.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/payment/zk")
    public Object paymentzk() {

        return new String("zookeeper:" + serverPort + ":" + UUID.randomUUID().toString());
    }


}
