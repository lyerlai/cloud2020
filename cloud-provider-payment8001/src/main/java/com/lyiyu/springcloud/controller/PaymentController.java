package com.lyiyu.springcloud.controller;

import com.lyiyu.springcloud.entities.CommonResult;
import com.lyiyu.springcloud.entities.Payment;
import com.lyiyu.springcloud.service.PaymentSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentSerivce paymentSerivce;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentSerivce.create(payment);
        log.info("****插入结果："+result);

        if(result>0) {
            return new CommonResult(200,"***插入数据成功***",result);
        }else {
            return new CommonResult(444,"***插入数据失败***",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentSerivce.getPaymentById(id);
        log.info("****查询结果："+payment);

        if(payment!=null){
            return new CommonResult(200,"***查询成功***",payment);
        }else {
            return new CommonResult(444, "***查询无数据", null);
        }
    }
}
