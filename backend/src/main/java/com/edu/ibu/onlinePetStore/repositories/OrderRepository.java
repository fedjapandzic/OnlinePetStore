package com.edu.ibu.onlinePetStore.repositories;

import com.edu.ibu.onlinePetStore.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
