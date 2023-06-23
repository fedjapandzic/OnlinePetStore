package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.Cart;
import com.edu.ibu.onlinePetStore.model.Product;
import com.edu.ibu.onlinePetStore.model.User;

import java.util.List;
import java.util.Optional;

public interface CartService {
    public Cart saveCart(Cart cart);
    public Optional<Cart> getCart(int id);

    public List<Product> getProductsInUserCarts(int userId);
}
