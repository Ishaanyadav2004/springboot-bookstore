package com.codewithishaan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codewithishaan.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {



}
