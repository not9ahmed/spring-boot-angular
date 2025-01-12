package com.notahmed.mvc_jpa_crud_demo.repository;

import com.notahmed.mvc_jpa_crud_demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
