package com.cabreradev.datasoftbackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long catId;
    @Column(name = "cat_name", unique = true, nullable = false)
    private String catName;

    public CategoryModel() {}

    public CategoryModel(Long catId, String catName) {
        this.catId = catId;
        this.catName = catName;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
