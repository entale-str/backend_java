package com.pweb.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookResponseDTO {
    private String title;
    private String isbn;
    private Float price;
    private int stockQuantity;
}
