package com.notahmed.jpa_rest_product.service;

import com.notahmed.jpa_rest_product.entity.Product;
import com.notahmed.jpa_rest_product.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

//    To handle transaction
    @Transactional
    public Product create(Product product) {
        product.setId(null);
        return productRepository.save(product);
    }


    @Transactional
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }


}
