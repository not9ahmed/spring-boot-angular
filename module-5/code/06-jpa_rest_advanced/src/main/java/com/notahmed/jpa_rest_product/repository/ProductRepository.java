package com.notahmed.jpa_rest_product.repository;

import com.notahmed.jpa_rest_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    JPQL Query
    @Query("SELECT p from Product p ORDER BY p.price")
    List<Product> findProductsSortedByPrice();

//    JPQL Query with Params
    @Query("SELECT p from Product p WHERE p.price BETWEEN :minPrice and :maxPrice")
    List<Product> findProductsByPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);

//    JPQL Advanced Features
//    It will call the @NamedQuery in model
    @Query(name = "Product.findByCategory")
    List<Product> findByCategory(@Param("category") String category);

//    Bulk Updates
    @Modifying
    @Transactional
    @Query(name = "Product.updatePriceByCategory")
    int updatePriceByCategory(@Param("price") double price, @Param("category") String category);


//    Native SQL Queries
    @Query(value = "SELECT * FROM products WHERE LOWER(title) LIKE LOWER(CONCAT('%', :title, '%'))", nativeQuery = true)
    List<Product> searchByTitle(@Param("title") String title);

}
