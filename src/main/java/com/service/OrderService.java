package com.service;

import com.dto.CommitOrderDTO;
import com.dto.OrderDetailDTO;
import com.pojo.OrderItem;

import java.util.List;

public interface OrderService {
    List<OrderDetailDTO> selectOrderDetailsByUserId(int userId);
    List<OrderItem> selectAllOrderItem();
    void creatOrder(CommitOrderDTO commitOrder,int userId);
}
