package com.example.demo.Models.Repo;

import com.example.demo.Controller.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
