package com.cabreradev.datasoftbackend.repositories;

import com.cabreradev.datasoftbackend.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryModel, Long> { }
