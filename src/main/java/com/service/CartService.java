package com.service;

import com.pojo.CartItem;

import java.util.List;

public interface CartService {
    List<CartItem> getUserCart(int userId);
}
