package com.felipelourenco.course.repositories;

import com.felipelourenco.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
