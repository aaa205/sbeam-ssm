package com.dto;

import com.pojo.Cart;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CommitOrderDTO {
    @NotNull
    private List<Cart> items;

    public List<Cart> getItems() {
        return items;
    }

    public void setItems(List<Cart> items) {
        this.items = items;
    }
}
