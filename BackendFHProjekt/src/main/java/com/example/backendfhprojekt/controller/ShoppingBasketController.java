package com.example.backendfhprojekt.controller;


import com.example.backendfhprojekt.model.ShoppingBasket;
import com.example.backendfhprojekt.service.ShoppingBasketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoppingbasket")
public class ShoppingBasketController
{
    private final ShoppingBasketService  shoppingBasketService;

    public ShoppingBasketController(ShoppingBasketService shoppingBasketService){
        this.shoppingBasketService = shoppingBasketService;

    }
@GetMapping
    public List<ShoppingBasket> GetAllShoppingBaskets() {
        return shoppingBasketService.GetAllShoppingBaskets();
    }
@GetMapping("/{shoppingBasketId}")
    public Optional<ShoppingBasket> getShoppingBasketById(@PathVariable Long shoppingBasketId) {
        return shoppingBasketService.getShoppingBasketById(shoppingBasketId);
    }

    @PostMapping
    public ShoppingBasket createShoppingBasket(@RequestBody ShoppingBasket shoppingBasket) {
        return shoppingBasketService.createShoppingBasket(shoppingBasket);
    }
@PutMapping("/{shoppingBasketId}")
    public ShoppingBasket updateShoppingBasket(@PathVariable Long shoppingBasketId, @RequestBody ShoppingBasket shoppingBasketDetails) {
        return shoppingBasketService.updateShoppingBasket(shoppingBasketId, shoppingBasketDetails);
    }
@DeleteMapping("/{shoppingBasketId}")
    public void deleteShoppingBasketById(@PathVariable Long shoppingBasketId) {
        shoppingBasketService.deleteShoppingBasketById(shoppingBasketId);
    }
}
