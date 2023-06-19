package com.edu.ibu.onlinePetStore.repositories;

import com.edu.ibu.onlinePetStore.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);
}
