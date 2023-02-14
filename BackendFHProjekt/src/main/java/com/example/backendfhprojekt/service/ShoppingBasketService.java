package com.example.backendfhprojekt.service;
import com.example.backendfhprojekt.model.ShoppingBasket;
import com.example.backendfhprojekt.repository.ShoppingBasketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingBasketService {
    private final ShoppingBasketRepository shoppingBasketRepository;

    public ShoppingBasketService(ShoppingBasketRepository shoppingBasketRepository1) {
        this.shoppingBasketRepository = shoppingBasketRepository1;
    }

    public List<ShoppingBasket> GetAllShoppingBaskets() {
        return shoppingBasketRepository.findAll();
    }

    public Optional<ShoppingBasket> getShoppingBasketById(Long shoppingBasketId) {
        return shoppingBasketRepository.findById(shoppingBasketId);
    }

    public ShoppingBasket createShoppingBasket(ShoppingBasket shoppingBasket) {
        return shoppingBasketRepository.save(shoppingBasket);
    }

    public ShoppingBasket updateShoppingBasket(Long shoppingBasketId, ShoppingBasket shoppingBasketDetails) {
        ShoppingBasket shoppingBasket = shoppingBasketRepository.findById(shoppingBasketId).orElseThrow();
shoppingBasket.setShoppingBasketId(shoppingBasketDetails.getShoppingBasketId());
        return shoppingBasketRepository.save(shoppingBasket);
    }


    public void deleteShoppingBasketById(Long shoppingBasketId) {
        shoppingBasketRepository.deleteById(shoppingBasketId);
    }
}
