package com.cabreradev.datasoftbackend.services;

import com.cabreradev.datasoftbackend.models.CategoryModel;
import com.cabreradev.datasoftbackend.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    public ArrayList<CategoryModel> getCategories() {
        return (ArrayList<CategoryModel>) categoryRepository.findAll();
    }
}
