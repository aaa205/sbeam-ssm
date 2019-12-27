package com.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CartUpdateDTO {
    private int product_id;
    @Min(1)
    private int quantity;
    @NotBlank
    private String type;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
