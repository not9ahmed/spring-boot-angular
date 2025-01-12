package com.notahmed.mvc_jpa_crud_demo.controller;

import com.notahmed.mvc_jpa_crud_demo.model.Product;
import com.notahmed.mvc_jpa_crud_demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public String listProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());

        String[] categories = {
                "Laptop",
                "PC",
                "Smartphone"
        };
        model.addAttribute("categories", categories);
        return "product-form";
    }


    @PostMapping("/save")
    public String saveProducts(@Valid @ModelAttribute Product product, BindingResult result, Model model) {

        if(result.hasErrors()){
            String[] categories = {
                    "Laptop",
                    "PC",
                    "Smartphone"
            };
            model.addAttribute("categories", categories);
            return "product-form";
        }

        productService.create(product);
        return "redirect:/products";
    }


    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id,  Model model) {
        Product product = productService.findById(id);
        if (product == null) {
            return "redirect:/products";
        }
        model.addAttribute("products", product);
        String[] categories = {
                "Laptop",
                "PC",
                "Smartphone"
        };
        model.addAttribute("categories", categories);
        return "product-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        productService.delete(id);
        return "redirect:/products";
    }

}
