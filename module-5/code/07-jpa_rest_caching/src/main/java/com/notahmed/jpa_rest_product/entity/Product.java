package com.notahmed.jpa_rest_product.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "products")
// will cache the results
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "productDetailCache")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String category;

    private Double price;

    public Product() {
    }

    public Product(Integer id, String title, String category, Double price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrices(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", prices=" + price +
                '}';
    }
}
