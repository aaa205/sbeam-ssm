package com.service;

import com.pojo.Cart;
import com.pojo.CartItem;

import java.util.List;

public interface CartService {
    List<CartItem> getUserCart(int userId);
    void pushToCart(Cart cart);
    void deleteCart(Cart cart);
    void updateCart(Cart cart);
}
