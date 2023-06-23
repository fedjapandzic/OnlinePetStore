package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.Cart;
import com.edu.ibu.onlinePetStore.model.Product;
import com.edu.ibu.onlinePetStore.model.User;
import com.edu.ibu.onlinePetStore.repository.CartRepository;
import com.edu.ibu.onlinePetStore.repository.ProductRepository;
import com.edu.ibu.onlinePetStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Cart saveCart(Cart cart) {
        Product product = productRepository.findById(cart.getProduct().getId());
        User user = userRepository.findById(cart.getUser().getId());
        cart.setUser(user);
        cart.setProduct(product);
        return cartRepository.save(cart);
    }

    @Override
    public Optional<Cart> getCart(int id) {
        return cartRepository.findById(id);
    }

    @Override
    public List<Product> getProductsInUserCarts(int userId) {
        List<Cart> carts = cartRepository.findByUserId(userId);
        List<Product> products = new ArrayList<>();

        for (Cart cart : carts){
            products.add(cart.getProduct());
        }
        return products;
    }

}
