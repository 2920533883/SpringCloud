package com.itzhang.springcloud.controller;

import com.itzhang.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DefaultProperties(defaultFallback = "paymentGlobalFallback")
public class OrderHystrixController {
    @Autowired
    PaymentHystrixService service;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable Integer id) {

        return service.paymentInfoOk(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
//    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        return service.paymentInfoTimeOut(id);
    }

    public String paymentInfoTimeoutHandler(Integer id) {
        return "我是80,系统忙线程池：" + Thread.currentThread().getName() + "  paymentInfo_TimeOut" + id;
    }
    public String paymentGlobalFallback() {
        return "我是80全局异常处理,系统忙 线程池：" + Thread.currentThread().getName() + "  paymentInfo_TimeOut";
    }
}
