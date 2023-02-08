package com.example.demo2.controller;


import com.example.demo2.entity.Product;
import com.example.demo2.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/save-product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/all-product")
    public List<Product> allProduct() {
        return productService.findAll();
    }

    @PutMapping("/update-product")
    public Product updateProduct(@RequestBody Product product){
        return productService.update(product);
    }

}
