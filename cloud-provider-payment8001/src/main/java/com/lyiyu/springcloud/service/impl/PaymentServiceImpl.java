package com.lyiyu.springcloud.service.impl;

import com.lyiyu.springcloud.dao.PaymentDao;
import com.lyiyu.springcloud.entities.Payment;
import com.lyiyu.springcloud.service.PaymentSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentSerivce {
    @Resource
    private PaymentDao paymentDao;

    public  int create(Payment payment)
    {
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
