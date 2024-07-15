package com.example.service_marketplace.repository;

import com.example.service_marketplace.model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
    // Additional query methods can be defined here
}
