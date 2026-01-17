package com.pweb.bookstore.Entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CATEGORY_ID")
    private Integer categoryId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "PRICE")
    private Float price;

    @Column(name = "STOCK_QUANTITY")
    private Integer stockQuantity;

    @Column(name = "PUBLISHER_ID")
    private Integer publisherId;

    @Column(name = "YEAR_PUBLISHED")
    private Integer yearPublished;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "COVER_IMAGE_URL")
    private String coverImageUrl;

    @Column(name = "CREATED_AT")
    private BigInteger createdAt;

    @Column(name = "UPDATED_AT")
    private BigInteger updatedAt;
}
