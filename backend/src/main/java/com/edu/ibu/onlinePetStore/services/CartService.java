package com.edu.ibu.onlinePetStore.services;
import com.edu.ibu.onlinePetStore.models.Cart;
import com.edu.ibu.onlinePetStore.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartById(Long id) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        return optionalCart.orElse(null);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Long id, Cart updatedCart) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (optionalCart.isPresent()) {
            Cart existingCart = optionalCart.get();
            existingCart.setEmpty(updatedCart.isEmpty());
            existingCart.setCustomer(updatedCart.getCustomer());
            return cartRepository.save(existingCart);
        } else {
            return null;
        }
    }

    public boolean deleteCart(Long id) {
        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (optionalCart.isPresent()) {
            cartRepository.delete(optionalCart.get());
            return true;
        } else {
            return false;
        }
    }
}
