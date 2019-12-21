package com.dao;

import com.dto.OrderDetailDTO;
import com.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int insert(Order record);

    List<Order> selectAll();
    List<OrderDetailDTO> selectOrderListByUserId(@Param("userId") int userId);
}