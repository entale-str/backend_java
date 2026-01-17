package com.pweb.bookstore.Mapper;

import com.pweb.bookstore.Entity.Products;
import com.pweb.bookstore.dto.ProductsSearchResponse;

public class ProductsSearchMapper {
    public static ProductsSearchResponse toDto(Products product) {
        ProductsSearchResponse dto = new ProductsSearchResponse();
        dto.setId(product.getId());
        dto.setSlug(product.getSlug());
        dto.setProductType(product.getProductType());
        dto.setTitle(product.getTitle());
        dto.setPrice(product.getPrice());
        dto.setStockQuantity(product.getStockQuantity());
        dto.setCategoryId(product.getCategoryId());
        dto.setPublisherId(product.getPublisherId());
        dto.setCoverImage(product.getCoverImageUrl());
        dto.setCreatedAt(product.getCreatedAt());
        dto.setUpdatedAt(product.getUpdatedAt());
        return dto;
    }
}