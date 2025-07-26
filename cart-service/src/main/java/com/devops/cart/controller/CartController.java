package com.devops.cart.controller;

import com.devops.cart.model.CartItem;
import com.devops.cart.service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping("/{userId}/items")
    public void addItem(@PathVariable String userId, @RequestBody CartItem item) {
        service.addItem(userId, item);
    }

    @GetMapping("/{userId}")
    public List<CartItem> getCart(@PathVariable String userId) {
        return service.getCart(userId);
    }

    @DeleteMapping("/{userId}")
    public void clearCart(@PathVariable String userId) {
        service.clearCart(userId);
    }
}
