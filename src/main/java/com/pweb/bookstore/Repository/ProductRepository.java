package com.pweb.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pweb.bookstore.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
