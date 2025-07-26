package com.devops.cart.service;

import com.devops.cart.model.CartItem;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CartService {
    private final Map<String, List<CartItem>> userCart = new HashMap<>();

    public void addItem(String userId, CartItem item) {
        userCart.computeIfAbsent(userId, k -> new ArrayList<>()).add(item);
    }

    public List<CartItem> getCart(String userId) {
        return userCart.getOrDefault(userId, new ArrayList<>());
    }

    public void clearCart(String userId) {
        userCart.remove(userId);
    }
}
