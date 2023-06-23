package com.edu.ibu.onlinePetStore.service;

import com.edu.ibu.onlinePetStore.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProduct(int id);
}
