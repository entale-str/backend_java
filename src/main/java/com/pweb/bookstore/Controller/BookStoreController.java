package com.pweb.bookstore.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pweb.bookstore.Service.ProductService;
import com.pweb.bookstore.dto.BookResponseDTO;

@RestController
@RequestMapping("/api/books")
public class BookStoreController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Map<String, BookResponseDTO> getProductById(
            @PathVariable int id 
    ) {
        return productService.getProductById(id);
    }
}
