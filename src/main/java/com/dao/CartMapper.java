package com.dao;

import com.pojo.Cart;
import com.pojo.CartItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int insert(Cart record);

    List<Cart> selectAll();

    List<CartItem> selectCartItemsByUserId(@Param("userId")int userId);
    boolean exist(Cart cart);
    int update(Cart cart);
}