package com.example.service_marketplace.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private Subcategory subcategory;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private User provider;

    private String location;
    private LocalDateTime createdAt;

    // Getters and setters
}
