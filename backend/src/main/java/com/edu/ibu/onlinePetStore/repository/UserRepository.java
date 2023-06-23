package com.edu.ibu.onlinePetStore.repository;

import com.edu.ibu.onlinePetStore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
