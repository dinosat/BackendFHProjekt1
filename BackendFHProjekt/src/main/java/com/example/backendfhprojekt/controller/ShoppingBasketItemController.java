package com.example.backendfhprojekt.controller;


import com.example.backendfhprojekt.model.ShoppingBasketItem;
import com.example.backendfhprojekt.service.ShoppingBasketItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoppingbasketItems")
public class ShoppingBasketItemController {

    private final ShoppingBasketItemService  shoppingBasketItemService;

    public ShoppingBasketItemController(ShoppingBasketItemService shoppingBasketItemService) {
        this.shoppingBasketItemService = shoppingBasketItemService;
    }

    @GetMapping
    public List<ShoppingBasketItem> GetAllShoppingBasketItems() {
        return shoppingBasketItemService.GetAllShoppingBasketItems();
    }
@GetMapping("/{shoppingBasketItemId}")
    public Optional<ShoppingBasketItem> getShoppingBasketItemById(@PathVariable Long shoppingBasketItemId) {
        return shoppingBasketItemService.getShoppingBasketItemById(shoppingBasketItemId);
    }
@PostMapping
    public ShoppingBasketItem addShoppingBasketItem(ShoppingBasketItem shoppingBasketItem) {
        return shoppingBasketItemService.addShoppingBasketItem(shoppingBasketItem);
    }

    @PutMapping("/{shoppingBasketItemId}")
    public ShoppingBasketItem updateShoppingBasketItem(@PathVariable Long shoppingBasketItemId,@RequestBody ShoppingBasketItem shoppingBasketItemDetails) {
        return shoppingBasketItemService.updateShoppingBasketItem(shoppingBasketItemId, shoppingBasketItemDetails);
    }

    @DeleteMapping("/{shoppingBasketItemId}")
    public void deleteShoppingBasketItemById(@PathVariable Long shoppingBasketItemId) {
        shoppingBasketItemService.deleteShoppingBasketItemById(shoppingBasketItemId);
    }


}
