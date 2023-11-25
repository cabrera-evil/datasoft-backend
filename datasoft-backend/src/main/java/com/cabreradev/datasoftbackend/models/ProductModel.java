package com.cabreradev.datasoftbackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long prdId;

    @Column(name = "prd_name", unique = true, nullable = false)
    private String prdName;
    @Column(name = "prd_description", nullable = false)
    private String prdDescription;
    @Column(name = "prd_price", nullable = false)
    private Double prdPrice;
    @Column(name = "prd_image", nullable = false)
    private String prdImage;
    @Column(name="prd_status", nullable = false)
    private Boolean prdStatus;
    @ManyToOne
    @JoinColumn(name = "cat_id", nullable = false)
    private CategoryModel categoryModel;

    public ProductModel() {}

    public ProductModel(String prdName, String prdDescription, Double prdPrice, String prdImage, Boolean prdStatus, CategoryModel categoryModel) {
        this.prdName = prdName;
        this.prdDescription = prdDescription;
        this.prdPrice = prdPrice;
        this.prdImage = prdImage;
        this.prdStatus = prdStatus;
        this.categoryModel = categoryModel;
    }

    public Long getPrdId() {
        return prdId;
    }

    public void setPrdId(Long prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getPrdDescription() {
        return prdDescription;
    }

    public void setPrdDescription(String prdDescription) {
        this.prdDescription = prdDescription;
    }

    public Double getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(Double prdPrice) {
        this.prdPrice = prdPrice;
    }

    public String getPrdImage() {
        return prdImage;
    }

    public void setPrdImage(String prdImage) {
        this.prdImage = prdImage;
    }

    public Boolean getPrdStatus() {
        return prdStatus;
    }

    public void setPrdStatus(Boolean prdStatus) {
        this.prdStatus = prdStatus;
    }

    public CategoryModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CategoryModel categoryModel) {
        this.categoryModel = categoryModel;
    }
}
