package com.example.backendfhprojekt.model;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;


    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;


    @ManyToOne
    @JoinColumn(name = "book_author_id")
    private BookAuthor bookAuthor;


}
