package com.pweb.bookstore.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsSearchResponse {
    private int id;
    private String slug;
    private String productType;
    private String title;
    private Double price;
    private int stockQuantity;
    private int categoryId;
    private int publisherId;
    private String coverImage;
    private java.math.BigInteger createdAt;
    private java.math.BigInteger updatedAt;
}
