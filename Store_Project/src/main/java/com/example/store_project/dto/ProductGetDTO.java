package com.example.store_project.dto;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.java.BigDecimalJavaType;

import java.math.BigDecimal;
import java.util.List;

public class ProductGetDTO {
    private Integer id;

    private BigDecimal price;
    private Integer brandId;
    private Integer reviewsCount;
    private BigDecimal reviewsAvg;
    private Integer categoryId;
    private Integer subCategoryId;
    private String pic;
    private String name;

//    @ManyToMany(mappedBy = "products")
//    private List<Basket> baskets;

    public ProductGetDTO() {
    }

    public ProductGetDTO(Integer id, BigDecimal price, Integer brandId,
                         Integer reviewsCount, BigDecimal reviewsAvg,
                         Integer categoryId, Integer subCategoryId,
                         String pic, String name) {
        this.id = id;
        this.price = price;
        this.brandId = brandId;
        this.reviewsCount = reviewsCount;
        this.reviewsAvg = reviewsAvg;
        this.categoryId = categoryId;
        this.subCategoryId = subCategoryId;
        this.pic = pic;
        this.name = name;
    }

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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public BigDecimal getReviewsAvg() {
        return reviewsAvg;
    }

    public void setReviewsAvg(BigDecimal reviewsAvg) {
        this.reviewsAvg = reviewsAvg;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

//    public List<Basket> getBaskets() {
//        return baskets;
//    }
//
//    public void setBaskets(List<Basket> baskets) {
//        this.baskets = baskets;
//    }
}
