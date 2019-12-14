package com.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
    private Integer id;

    private String name;

    private String description;

    private BigDecimal price;

    private Long releaseDate;

    private String developer;

    private String publisher;

    private Boolean isSinglePlayer;

    private Boolean isMultiPlayer;

    private Boolean isCloudSave;

    private String supportedLanguages;

    private String cardImg;

    private String logoImg;

    private String img0;

    private String img1;

    private String img2;

    private String img3;

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

    public Long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
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

    public Boolean getIsSinglePlayer() {
        return isSinglePlayer;
    }

    public void setIsSinglePlayer(Boolean isSinglePlayer) {
        this.isSinglePlayer = isSinglePlayer;
    }

    public Boolean getIsMultiPlayer() {
        return isMultiPlayer;
    }

    public void setIsMultiPlayer(Boolean isMultiPlayer) {
        this.isMultiPlayer = isMultiPlayer;
    }

    public Boolean getIsCloudSave() {
        return isCloudSave;
    }

    public void setIsCloudSave(Boolean isCloudSave) {
        this.isCloudSave = isCloudSave;
    }

    public String getSupportedLanguages() {
        return supportedLanguages;
    }

    public void setSupportedLanguages(String supportedLanguages) {
        this.supportedLanguages = supportedLanguages == null ? null : supportedLanguages.trim();
    }

    public String getCardImg() {
        return cardImg;
    }

    public void setCardImg(String cardImg) {
        this.cardImg = cardImg == null ? null : cardImg.trim();
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg == null ? null : logoImg.trim();
    }

    public String getImg0() {
        return img0;
    }

    public void setImg0(String img0) {
        this.img0 = img0 == null ? null : img0.trim();
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
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
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", developer=").append(developer);
        sb.append(", publisher=").append(publisher);
        sb.append(", isSinglePlayer=").append(isSinglePlayer);
        sb.append(", isMultiPlayer=").append(isMultiPlayer);
        sb.append(", isCloudSave=").append(isCloudSave);
        sb.append(", supportedLanguages=").append(supportedLanguages);
        sb.append(", cardImg=").append(cardImg);
        sb.append(", logoImg=").append(logoImg);
        sb.append(", img0=").append(img0);
        sb.append(", img1=").append(img1);
        sb.append(", img2=").append(img2);
        sb.append(", img3=").append(img3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}