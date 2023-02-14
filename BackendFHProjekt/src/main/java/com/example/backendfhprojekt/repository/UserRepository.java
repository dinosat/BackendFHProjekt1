package com.example.backendfhprojekt.repository;

import com.example.backendfhprojekt.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Long> {
}
