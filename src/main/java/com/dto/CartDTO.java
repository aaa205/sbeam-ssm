package com.dto;

import com.pojo.CartItem;

import java.util.List;

public class CartDTO extends CommonDTO{
    private List<CartItem> items;

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}
