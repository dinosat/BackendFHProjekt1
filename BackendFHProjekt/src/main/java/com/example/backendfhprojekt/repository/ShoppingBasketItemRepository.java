package com.example.backendfhprojekt.repository;

import com.example.backendfhprojekt.model.ShoppingBasketItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingBasketItemRepository extends JpaRepository <ShoppingBasketItem, Long>{
}
