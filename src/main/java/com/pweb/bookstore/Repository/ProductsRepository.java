package com.pweb.bookstore.Repository;

import com.pweb.bookstore.Entity.Products;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ProductsRepository extends JpaRepository<Products, Integer> {
    Products findBySlug(String slug);
    List<Products> findByCategoryId(Integer categoryId);
    Page<Products> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    Page<Products> findByTitleContainingIgnoreCaseAndProductType(String title, String productType, Pageable pageable);
}
