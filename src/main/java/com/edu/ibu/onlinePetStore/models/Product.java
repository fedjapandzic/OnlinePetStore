package com.edu.ibu.onlinePetStore.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long products_id;

    private String name;

    private String desc;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Product(Long products_id, String name, String desc, int price, Category category, Cart cart) {
        this.products_id = products_id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.category = category;
        this.cart = cart;
    }
}
