package com.dto;

import java.util.List;

public class OrderListDTO{
    private List<OrderDetailDTO> orders;

    public List<OrderDetailDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetailDTO> orders) {
        this.orders = orders;
    }


}
