package com.dao;

import com.pojo.OrderItem;
import java.util.List;

public interface OrderItemMapper {
    int insert(OrderItem record);

    List<OrderItem> selectAll();
}