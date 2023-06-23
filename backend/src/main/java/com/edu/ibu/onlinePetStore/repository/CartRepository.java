package com.edu.ibu.onlinePetStore.repository;

import com.edu.ibu.onlinePetStore.model.Cart;
import com.edu.ibu.onlinePetStore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
    List<Cart> findByUserId(int userId);
}
