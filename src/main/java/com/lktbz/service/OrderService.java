package com.lktbz.service;


import com.lktbz.entity.Order;
import com.lktbz.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class OrderService {
    @Resource
    OrderMapper orderMapper;

    public static Long orderId = 1L;
    public static Long userId = 1L;

    public void insert() {
        for (int i = 1; i <= 100; i++) {
            Order order = new Order();
            order.setOrderId(i);
            order.setUserId(i);
            orderId++;
            userId++;
            orderMapper.insert(order);
        }
    }

    public Order getOrderInfoByOrderId(Integer id){
        return orderMapper.selectByPrimaryKey(id);
    }

}
