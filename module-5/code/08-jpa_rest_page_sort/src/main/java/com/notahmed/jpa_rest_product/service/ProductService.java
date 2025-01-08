package com.notahmed.jpa_rest_product.service;

import com.notahmed.jpa_rest_product.entity.Product;
import com.notahmed.jpa_rest_product.repository.ProductRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public List<Product> findAllPaginated(int pageNumber, int pageSize, String sort) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sort).ascending());


//        Chaining the sort
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sort).ascending().and(Sort.by("price")));
        return productRepository.findAll(pageable).get().toList();
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
