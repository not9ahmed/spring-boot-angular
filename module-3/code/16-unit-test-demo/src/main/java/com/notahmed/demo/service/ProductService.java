package com.notahmed.demo.service;

import com.notahmed.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        System.out.println("ProductService was called");
        products.add(new Product(1, "Dell Laptop", "Laptops", 300.990));
        products.add(new Product(2, "iPhone 16", "Phone", 349.990));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    public Optional<Product> getProduct(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    public boolean updateProduct(int id, Product product) {

        for (Product p: products) {
            if (p.getId() == id) {
                p.setTitle(product.getTitle());
                p.setCategory(product.getCategory());
                p.setPrice(product.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        return products.removeIf(product -> product.getId() == id);
    }
}
