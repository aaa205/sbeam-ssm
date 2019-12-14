package com.dao;

import com.pojo.Order;
import java.util.List;

public interface OrderMapper {
    int insert(Order record);

    List<Order> selectAll();
}