package com.dto;

import java.math.BigDecimal;

public class IndexProductDTO {
    private Integer id;

    private String name;

    private BigDecimal price;

    private String developer;

    private String publisher;

    private String card_img;

    private String logo_img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCard_img() {
        return card_img;
    }

    public void setCard_img(String card_img) {
        this.card_img = card_img;
    }

    public String getLogo_img() {
        return logo_img;
    }

    public void setLogo_img(String logo_img) {
        this.logo_img = logo_img;
    }
}
