package com.pweb.bookstore.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {
    @Autowired
    @GetMapping("/test")
    public HashMap<String, String> testEndpoint() {
        HashMap<String, String> response = new HashMap<>();
        response.put("message","Success");
        return response;

    }
}
