package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
    // yeha hamile aafno business logic haru lekhnu parxa
    public ProductDto products(ProductDto pro){
        if( pro.getId()== null){
            return null;
        }
//        if( pro.getName() == null){
//            System.out.println(" Name cannot be empty ");
//        }
        if (pro.getName() == null || pro.getName().trim().isEmpty()) {
            System.out.println("Name cannot be empty");
        }
        if(pro.getPrice()== null){
            return null;

        }
        if(pro.getStock()== null){
            return null;

        }
        if(pro.getImageUrl() == null){
            System.out.println(" Paste the url ");

        }
return new ProductDto(pro.getId(), pro.getName(), pro.getPrice(),pro.getStock(),pro.getImageUrl());

    }

}
