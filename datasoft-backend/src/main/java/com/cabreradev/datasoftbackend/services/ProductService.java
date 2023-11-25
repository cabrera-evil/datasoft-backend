package com.cabreradev.datasoftbackend.services;

import com.cabreradev.datasoftbackend.models.ProductModel;
import com.cabreradev.datasoftbackend.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepository productRepository;

    public ArrayList<ProductModel> getProducts() {return (ArrayList<ProductModel>) productRepository.findAll();}

    public ArrayList<ProductModel> getProductsByCategory(Long catId) {return productRepository.findByCategoryModel_catId(catId);}

    public Optional<ProductModel> getProductById(Long prodId) {return productRepository.findById(prodId);}
}
