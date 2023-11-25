package com.cabreradev.datasoftbackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long cat_id;
    @Column(name = "cat_name", unique = true, nullable = false)
    private String cat_name;

    public CategoryModel() {}

    public CategoryModel(Long cat_id, String cat_name) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
    }

    public Long getCat_id() {
        return cat_id;
    }

    public void setCat_id(Long cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
}
