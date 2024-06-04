package com.felipelourenco.course.repositories;

import com.felipelourenco.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
