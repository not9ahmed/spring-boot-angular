package com.notahmed.demo.service;

import com.notahmed.demo.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductServiceTests {

    ProductService productService;

    @Test
    public void getAllProducts_success() {
        productService = new ProductService();
        List<Product> products = productService.getAllProducts();
        Assertions.assertEquals(2, products.size());
    }

    @Test
    public void createProduct_success() {
        productService = new ProductService();
        productService.createProduct(new Product(3, "iPhone 14", "Smartphone", 250));
        List<Product> products = productService.getAllProducts();
        Assertions.assertEquals(3, products.size());
    }


    @Test
    public void deleteProducts_success() {
        productService = new ProductService();
        Assertions.assertTrue(productService.deleteProduct(1));
    }


//    @Test
//    public void deleteProducts_failure() {
//        productService = new ProductService();
//        Assertions.assertTrue(productService.deleteProduct(10));
//    }
}
