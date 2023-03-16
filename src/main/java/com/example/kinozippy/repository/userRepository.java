package com.example.kinozippy.repository;

import com.example.kinozippy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {
}
