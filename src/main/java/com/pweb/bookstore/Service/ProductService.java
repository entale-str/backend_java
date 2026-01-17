package com.pweb.bookstore.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pweb.bookstore.Entity.Product;
import com.pweb.bookstore.Repository.ProductRepository;
import com.pweb.bookstore.dto.BookResponseDTO;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Map<String, BookResponseDTO> getProductById(int id) {

        Product p = productRepository.findById(id).orElse(null);
        if (p == null) return null;

        BookResponseDTO dto = new BookResponseDTO(
            p.getTitle(),
            p.getIsbn(),
            p.getPrice(),
            p.getStockQuantity()
        );

        Map<String, BookResponseDTO> response = new HashMap<>();
        response.put(p.getId().toString(), dto);

        return response;
    }
}
