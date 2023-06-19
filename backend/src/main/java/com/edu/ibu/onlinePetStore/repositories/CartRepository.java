package com.edu.ibu.onlinePetStore.repositories;

import com.edu.ibu.onlinePetStore.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
