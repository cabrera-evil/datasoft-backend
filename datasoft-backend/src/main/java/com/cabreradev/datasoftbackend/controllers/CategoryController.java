package com.cabreradev.datasoftbackend.controllers;

import com.cabreradev.datasoftbackend.models.CategoryModel;
import com.cabreradev.datasoftbackend.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/test")
    public String test() {
        return "Category Controller Works";
    }

    @GetMapping
    public ArrayList<CategoryModel> getAllCategories() {
        return this.categoryService.getCategories();
    }
}
