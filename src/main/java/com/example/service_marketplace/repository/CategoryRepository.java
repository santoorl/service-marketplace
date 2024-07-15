package com.example.service_marketplace.repository;

import com.example.service_marketplace.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Additional query methods can be defined here
}
