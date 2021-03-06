package com.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
    private Integer id;

    private String name;

    private String description;

    private BigDecimal price;

    private Long release_date;

    private String developer;

    private String publisher;

    private Boolean is_single_player;

    private Boolean is_multi_player;

    private Boolean is_cloud_save;

    private String supported_languages;

    private String card_img;

    private String logo_img;

    private String img_0;

    private String img_1;

    private String img_2;

    private String img_3;

    private static final long serialVersionUID = 1L;

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
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Long release_date) {
        this.release_date = release_date;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Boolean getIs_single_player() {
        return is_single_player;
    }

    public void setIs_single_player(Boolean is_single_player) {
        this.is_single_player = is_single_player;
    }

    public Boolean getIs_multi_player() {
        return is_multi_player;
    }

    public void setIs_multi_player(Boolean is_multi_player) {
        this.is_multi_player = is_multi_player;
    }

    public Boolean getIs_cloud_save() {
        return is_cloud_save;
    }

    public void setIs_cloud_save(Boolean is_cloud_save) {
        this.is_cloud_save = is_cloud_save;
    }

    public String getSupported_languages() {
        return supported_languages;
    }

    public void setSupported_languages(String supported_languages) {
        this.supported_languages = supported_languages == null ? null : supported_languages.trim();
    }

    public String getCard_img() {
        return card_img;
    }

    public void setCard_img(String card_img) {
        this.card_img = card_img == null ? null : card_img.trim();
    }

    public String getLogo_img() {
        return logo_img;
    }

    public void setLogo_img(String logo_img) {
        this.logo_img = logo_img == null ? null : logo_img.trim();
    }

    public String getImg_0() {
        return img_0;
    }

    public void setImg_0(String img_0) {
        this.img_0 = img_0 == null ? null : img_0.trim();
    }

    public String getImg_1() {
        return img_1;
    }

    public void setImg_1(String img_1) {
        this.img_1 = img_1 == null ? null : img_1.trim();
    }

    public String getImg_2() {
        return img_2;
    }

    public void setImg_2(String img_2) {
        this.img_2 = img_2 == null ? null : img_2.trim();
    }

    public String getImg_3() {
        return img_3;
    }

    public void setImg_3(String img_3) {
        this.img_3 = img_3 == null ? null : img_3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", price=").append(price);
        sb.append(", release_date=").append(release_date);
        sb.append(", developer=").append(developer);
        sb.append(", publisher=").append(publisher);
        sb.append(", is_single_player=").append(is_single_player);
        sb.append(", is_multi_player=").append(is_multi_player);
        sb.append(", is_cloud_save=").append(is_cloud_save);
        sb.append(", supported_languages=").append(supported_languages);
        sb.append(", card_img=").append(card_img);
        sb.append(", logo_img=").append(logo_img);
        sb.append(", img_0=").append(img_0);
        sb.append(", img_1=").append(img_1);
        sb.append(", img_2=").append(img_2);
        sb.append(", img_3=").append(img_3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}