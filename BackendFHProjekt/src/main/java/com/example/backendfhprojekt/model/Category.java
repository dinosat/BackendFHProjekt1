package com.example.backendfhprojekt.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long categoryId;
    private String categoryName;

}
