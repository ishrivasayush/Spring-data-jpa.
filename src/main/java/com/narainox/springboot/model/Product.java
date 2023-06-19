package com.narainox.springboot.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products",
        schema = "production",
        uniqueConstraints = {
        @UniqueConstraint(
                name = "sku_unique",
                columnNames = "stock_keeping_unit"
        )
                /*
                @UniqueConstraint(
                        name = "name_unique",
                        columnNames = "name"
                )

                 */

        }


)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stock_keeping_unit",nullable = false)
    private String sku;
    @Column(nullable = false,length = 25)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imhUrl;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImhUrl() {
        return imhUrl;
    }

    public void setImhUrl(String imhUrl) {
        this.imhUrl = imhUrl;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Product(Long id, String sku, String name, String description, BigDecimal price, boolean active, String imhUrl, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.description = description;
        this.price = price;
        this.active = active;
        this.imhUrl = imhUrl;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
}
