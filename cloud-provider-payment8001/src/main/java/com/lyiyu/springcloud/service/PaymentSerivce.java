package com.lyiyu.springcloud.service;

import com.lyiyu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentSerivce {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
