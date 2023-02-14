package com.example.backendfhprojekt.repository;

import com.example.backendfhprojekt.model.ShoppingBasket;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ShoppingBasketRepository extends JpaRepository <ShoppingBasket, Long> {
}
