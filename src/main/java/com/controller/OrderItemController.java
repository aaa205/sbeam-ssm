package com.controller;

import com.pojo.OrderItem;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemController {
    @Autowired
    private OrderService orderService;
    @GetMapping(name = "getOrderItems",path = "/api/order-items")
    public List<OrderItem> getAllOrderItems(){
        return orderService.selectAllOrderItem();
    }
}
