package com.harish.ecommerce.controller;

import com.harish.ecommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = Arrays.asList(
                new Product(1L, "Laptop", 65000.0),
                new Product(2L, "Smartphone", 30000.0),
                new Product(3L, "Headphones", 2500.0)
        );
        model.addAttribute("products", products);
        return "index";
    }
}

