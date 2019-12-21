package com.service;

import com.dto.CommitOrderDTO;
import com.dto.OrderDetailDTO;

import java.util.List;

public interface OrderService {
    List<OrderDetailDTO> selectOrderDetailsByUserId(int userId);
    void creatOrder(CommitOrderDTO commitOrder,int userId);
}
