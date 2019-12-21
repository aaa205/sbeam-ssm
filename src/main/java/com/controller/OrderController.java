package com.controller;

import com.aop.RoleAuthentication;
import com.dto.CommitOrderDTO;
import com.dto.CommonDTO;
import com.dto.OrderListDTO;
import com.pojo.User;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    @RoleAuthentication
    public OrderListDTO getOrderList(HttpSession session) {
        int userId = ((User) session.getAttribute("user")).getId();
        OrderListDTO orderList = new OrderListDTO();
        orderList.setOrders(orderService.selectOrderDetailsByUserId(userId));
        return orderList;
    }
    @PostMapping
    @RoleAuthentication
    public CommonDTO createOrder(HttpSession session, @Valid @RequestBody CommitOrderDTO commitOrder){
        int userId=((User) session.getAttribute("user")).getId();
        orderService.creatOrder(commitOrder,userId);
        return new CommonDTO(0,"success");
    }
}
