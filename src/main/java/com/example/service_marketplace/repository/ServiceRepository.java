package com.example.service_marketplace.repository;

import com.example.service_marketplace.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    // Additional query methods can be defined here
}
