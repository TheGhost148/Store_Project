package com.example.store_project.repository;

import com.example.store_project.domain.model.Category;
import com.example.store_project.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    public List<Product> getProductsByCategory(Category category);
}
