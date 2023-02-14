package com.example.backendfhprojekt.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ShoppingBasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ShoppingBasketItemId;
    private int shoppingBasketItemQuantity;

    @ManyToOne
    @JoinColumn(name = "basket_id")
    private ShoppingBasket shoppingBasket;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
