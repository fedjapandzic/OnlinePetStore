package com.edu.ibu.onlinePetStore.controller;

import com.edu.ibu.onlinePetStore.exception.CartNotFoundException;
import com.edu.ibu.onlinePetStore.exception.UserNotFoundException;
import com.edu.ibu.onlinePetStore.model.Cart;
import com.edu.ibu.onlinePetStore.model.User;
import com.edu.ibu.onlinePetStore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public String add(@RequestBody Cart cart){
        cartService.saveCart(cart);
        return "Cart with ID:"+ cart.getId() + " successfully added!";
    }

    @GetMapping("/{id}")
    public Optional<Cart> getCartById(@PathVariable("id") int id){
        Optional<Cart> cart = cartService.getCart(id);
        if (cart == null){
            throw new CartNotFoundException("Cart not found with ID: " + id);
        }
        return cart;
    }
}
