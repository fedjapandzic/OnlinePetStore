package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.Cart;
import com.edu.ibu.onlinePetStore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;
    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Optional<Cart> getCart(int id) {
        return cartRepository.findById(id);
    }
}
