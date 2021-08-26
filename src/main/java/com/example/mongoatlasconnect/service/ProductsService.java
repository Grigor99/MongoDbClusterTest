package com.example.mongoatlasconnect.service;

import com.example.mongoatlasconnect.model.Products;
import com.example.mongoatlasconnect.repo.ProductsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @PostConstruct
    public void create() {
        Products products = new Products();
        products.setPrice(55.8);
        products.setName("Name");
        products.setQuality("quality");
        productsRepository.save(products);
    }
}
