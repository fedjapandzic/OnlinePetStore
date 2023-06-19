package com.edu.ibu.onlinePetStore.repositories;

import com.edu.ibu.onlinePetStore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
