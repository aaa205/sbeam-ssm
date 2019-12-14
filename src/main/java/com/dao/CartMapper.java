package com.dao;

import com.pojo.Cart;
import java.util.List;

public interface CartMapper {
    int insert(Cart record);

    List<Cart> selectAll();
}