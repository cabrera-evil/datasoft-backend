package com.cabreradev.datasoftbackend.controllers;

import com.cabreradev.datasoftbackend.models.ProductModel;
import com.cabreradev.datasoftbackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/test")
    public String test() {
        return "Product Controller Works";
    }

    @GetMapping
    public ArrayList<ProductModel> getAllProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/filter")
    public Object getProductsByCategory(
            @RequestParam(required = false) Long category,
            @RequestParam(required = false) Long id
    ) {
        if (category != null) {
            return this.productService.getProductsByCategory(category);
        } else if (id != null) {
            Optional<ProductModel> product = this.productService.getProductById(id);
            return product.isPresent() ? List.of(product.get()) : new ArrayList<>();
        } else {
            return this.productService.getProducts();
        }
    }
}
