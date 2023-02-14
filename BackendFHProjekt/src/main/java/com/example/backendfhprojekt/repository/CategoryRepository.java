package com.example.backendfhprojekt.repository;
import com.example.backendfhprojekt.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
