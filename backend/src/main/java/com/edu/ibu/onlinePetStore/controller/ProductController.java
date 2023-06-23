package com.edu.ibu.onlinePetStore.controller;

import com.edu.ibu.onlinePetStore.exception.ProductNotFoundException;
import com.edu.ibu.onlinePetStore.model.Product;
import com.edu.ibu.onlinePetStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New product added";
    }

    @GetMapping("/getAll")
    public List<Product> products(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") int id){
        Product product = productService.getProduct(id);
        if (product == null){
            throw new ProductNotFoundException("Product not found with ID: " + id);
        }
        return product;
    }
}
