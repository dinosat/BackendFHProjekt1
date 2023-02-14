package com.example.backendfhprojekt.repository;

import com.example.backendfhprojekt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
