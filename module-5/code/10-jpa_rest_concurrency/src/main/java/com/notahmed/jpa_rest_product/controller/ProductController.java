package com.notahmed.jpa_rest_product.controller;

import com.notahmed.jpa_rest_product.entity.Product;
import com.notahmed.jpa_rest_product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {
        Product product = productService.findById(id).orElseThrow();
        return ResponseEntity.ok(product);
    }


    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product productSaved = productService.create(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productSaved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
        product.setId(id);
        Product productUpdated = productService.update(product);
        return ResponseEntity.ok(productUpdated);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body(null);
    }

}
