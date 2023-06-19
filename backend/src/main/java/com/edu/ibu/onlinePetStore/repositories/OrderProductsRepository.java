package com.edu.ibu.onlinePetStore.repositories;

import com.edu.ibu.onlinePetStore.models.OrderProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductsRepository extends JpaRepository<OrderProducts, Long> {
}
