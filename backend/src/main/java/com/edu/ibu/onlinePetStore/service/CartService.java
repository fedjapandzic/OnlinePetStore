package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.Cart;

import java.util.Optional;

public interface CartService {
    public Cart saveCart(Cart cart);
    public Optional<Cart> getCart(int id);
}
