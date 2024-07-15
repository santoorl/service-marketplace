package com.example.service_marketplace.model;

import javax.persistence.*;

@Entity
@Table(name = "subcategories")
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Getters and setters
}
