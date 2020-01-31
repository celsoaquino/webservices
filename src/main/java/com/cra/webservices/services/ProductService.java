package com.cra.webservices.services;

import com.cra.webservices.entities.Product;
import com.cra.webservices.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj = productRepository.findById(id);
       return obj.get();
    }
}
