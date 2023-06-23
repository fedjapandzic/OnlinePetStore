package com.edu.ibu.onlinePetStore.repository;

import com.edu.ibu.onlinePetStore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
