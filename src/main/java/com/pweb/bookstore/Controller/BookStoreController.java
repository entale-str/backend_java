package com.pweb.bookstore.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;

import com.pweb.bookstore.Service.BookStoreService;
import com.pweb.bookstore.Entity.Products;
import com.pweb.bookstore.dto.ProductsSearchResponse;

@RestController
@RequestMapping("/api/bookstore")
public class BookStoreController {
    @Autowired
    private BookStoreService bookStoreService;

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return bookStoreService.getAllProducts();
    }

    @GetMapping("/products/slug/{slug}")
    public Products getProductBySlug(@PathVariable String slug) {
        return bookStoreService.getProductBySlug(slug);
    }

    @GetMapping("/products/id/{id}")
    public Products getProductById(@PathVariable Integer id) {
        return bookStoreService.getProductById(id);
    }

    @GetMapping("/products/category/{categoryId}")
    public List<Products> getProductsByCategoryId(@PathVariable Integer categoryId) {
        return bookStoreService.getProductsByCategoryId(categoryId);
    }

    @GetMapping("/buku/search")
    public ResponseEntity<Page<ProductsSearchResponse>> search(
            @RequestParam String q,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        int MAX_PAGE_SIZE = 50;
        if (size > MAX_PAGE_SIZE) {
            size = MAX_PAGE_SIZE;
        }

        return ResponseEntity.ok(
                bookStoreService.searchByTitle(q, page, size)
        );
    }
}
