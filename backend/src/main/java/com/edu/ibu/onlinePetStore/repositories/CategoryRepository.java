package com.edu.ibu.onlinePetStore.repositories;

import com.edu.ibu.onlinePetStore.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
