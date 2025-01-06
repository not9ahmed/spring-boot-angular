package com.notahmed.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.notahmed.demo.model.Product;
import com.notahmed.demo.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;


import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class ProductControllerTests {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    private ObjectMapper objectMapper;

    private MockMvc mockMvc;


    public ProductControllerTests(){

        objectMapper = new ObjectMapper();
        MockitoAnnotations.openMocks(this);

//        mocking the service
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();

    }


    @Test
    public void getAllProducts_success() throws Exception {
        List<Product> products = List.of(
                new Product(1, "Dell Laptop", "Laptop", 78787),
                new Product(2, "iPhone 16", "Smartphone", 65655)
        );
        Mockito.when(productService.getAllProducts()).thenReturn(products);

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.get("/products")
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(mockRequest)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }


    @Test
    public void createProduct_success() throws Exception {


        Product newProduct = new Product(1, "HP Laptop", "Laptop", 78787);

        Mockito.when(productService.createProduct(newProduct)).thenReturn(newProduct);

        String content = objectMapper.writeValueAsString(newProduct);

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(content);

        mockMvc.perform(mockRequest)
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title", is("HP Laptop")));
    }
}
