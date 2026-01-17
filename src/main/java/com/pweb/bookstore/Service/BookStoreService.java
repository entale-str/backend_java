package com.pweb.bookstore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.pweb.bookstore.Entity.Products;
import com.pweb.bookstore.Repository.ProductsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.pweb.bookstore.Mapper.ProductsSearchMapper;
import com.pweb.bookstore.dto.ProductsSearchResponse;

@Service
public class BookStoreService {
    @Autowired
    ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public Products getProductBySlug(String slug) {
        return productsRepository.findBySlug(slug);
    }

    public Products getProductById(Integer id) {
        return productsRepository.findById(id).orElse(null);
    }

    public List<Products> getProductsByCategoryId(Integer categoryId) {
        return productsRepository.findByCategoryId(categoryId);
    }

    public Page<ProductsSearchResponse> searchByTitle(String keyword, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return productsRepository
                .findByTitleContainingIgnoreCaseAndProductType(keyword, "book", pageable)
                .map(ProductsSearchMapper::toDto);
    }
}
