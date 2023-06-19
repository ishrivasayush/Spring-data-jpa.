package com.narainox.springboot.service;

import com.narainox.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{
    @Autowired
    private ProductRepository productRepository;



}
