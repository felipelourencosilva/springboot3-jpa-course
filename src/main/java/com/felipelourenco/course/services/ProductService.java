package com.felipelourenco.course.services;

import com.felipelourenco.course.entities.Product;
import com.felipelourenco.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> Product = repository.findById(id);
        return Product.get();
    }
}
