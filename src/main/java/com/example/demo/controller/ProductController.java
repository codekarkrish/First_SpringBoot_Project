package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.ProductDto;
@RestController
@RequestMapping
@CrossOrigin("*")
public class ProductController {

//    @GetMapping("/prod")
//    public String prod(){
//        return  " These are the product details ";

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/proSer")
        public ProductDto services (@RequestBody ProductDto dto){
            return productService.products(dto);

    }
}


