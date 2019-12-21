package com.service;

import com.dao.CartMapper;
import com.pojo.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public List<CartItem> getUserCart(int userId) {
        return cartMapper.selectCartItemsByUserId(userId);
    }
}
