package com.notahmed.demo.controller;

import com.notahmed.demo.exception.ResourceNotFound;
import com.notahmed.demo.model.Product;
import com.notahmed.demo.service.ProductService;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return products;
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {

        productService.createProduct(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(product);
    }


    @GetMapping("/{id}")
    public EntityModel<Product> getProductById(@PathVariable("id") int id) {

        Product product = productService.getProduct(id)
                .orElseThrow(() -> new ResourceNotFound("Product not found with id: " + id));

        // Will create a response with the entity and self reference
        return EntityModel.of(product,
                linkTo(methodOn(ProductController.class).getProductById(id)).withSelfRel(),
                linkTo(methodOn(ProductController.class).updateProduct(id, product)).withRel("put"),
                linkTo(methodOn(ProductController.class).deleteProduct(id)).withRel("delete")
        );
    }



//    @GetMapping("/{id}")
//    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
//
//        Product product = productService.getProduct(id)
//                .orElseThrow(() -> new ResourceNotFound("Product not found with id: " + id));
//
//        return ResponseEntity.ok(product);
//    }




//    @ExceptionHandler(ResourceNotFound.class)
//    public ResponseEntity<String> handleResourcetNotFoundException(ResourceNotFound exception) {
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(exception.getMessage());
//    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {

        if (!productService.updateProduct(id, product)) {
            throw new ResourceNotFound("Product update failed with id " + id);
        }
        
        return ResponseEntity.ok("Product updated successfully");
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {

        if (!productService.deleteProduct(id)) {
            throw new ResourceNotFound("Product delete failed with id " + id);
        }

        return ResponseEntity.ok("Product Deleted Successfully");
    }


}
