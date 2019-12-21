package com.service;

import com.pojo.Cart;
import com.pojo.CartItem;

import java.util.List;

public interface CartService {
    List<CartItem> getUserCart(int userId);
    void addCart(Cart cart);
}
