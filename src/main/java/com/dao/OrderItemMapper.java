package com.dao;

import com.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemMapper {
    int insert(OrderItem record);

    List<OrderItem> selectAll();
    List<OrderItem> selectOrderItemsByOrderId(@Param("OrderId") int orderId);
    List<OrderItem> createOrderItemByProductId(List<Integer> list);
    int insertForEach(List<OrderItem> list);
}