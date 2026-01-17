package com.pweb.bookstore.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "slug")
    private String slug;

    @Column(name = "sku")
    private String sku;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "title")
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "compare_at_price")
    private Double compareAtPrice;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "low_stock_threshold")
    private Integer lowStockThreshold;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "publisher_id")
    private Integer publisherId;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "language")
    private String language;

    @Column(name = "year_published")
    private Integer yearPublished;

    @Column(name = "width")
    private Double width;

    @Column(name = "height")
    private Double height;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "cover_image_url")
    private String coverImageUrl;

    @Column(name = "meta_title")
    private String metaTitle;

    @Column(columnDefinition = "TEXT")
    private String metaDescription;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "is_featured")
    private Boolean isFeatured;

    @Column(name = "created_at")
    private BigInteger createdAt;

    @Column(name = "updated_at")
    private BigInteger updatedAt;
}
