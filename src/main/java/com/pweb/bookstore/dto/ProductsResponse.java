package com.pweb.bookstore.dto;

import java.util.List;

public class ProductsResponse {
    private String productMetaId;
    private String title;
    private String slug;
    private String coverImageUrl;
    private List<String> images;
    private String author;
    private String authorSlug;
    private int price;
    private int OriginalPrice;
    private int discount;
    private Boolean isOutOfStock;
    private String sku;
    private String categorySlug;
    private String categoryStype;
    private String format;
    private String description;
    private String isbn;
    private String publisher;
    private String publishDate;
    private int pages;
    private String language;
    private String length;
    private String width;
    private String weight;
}
