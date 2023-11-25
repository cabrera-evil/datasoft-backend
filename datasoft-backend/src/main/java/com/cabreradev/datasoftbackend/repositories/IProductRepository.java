package com.cabreradev.datasoftbackend.repositories;

import com.cabreradev.datasoftbackend.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IProductRepository extends JpaRepository<ProductModel, Long> {
    ArrayList<ProductModel> findByCategoryModel_catId(Long cat_id);
}
