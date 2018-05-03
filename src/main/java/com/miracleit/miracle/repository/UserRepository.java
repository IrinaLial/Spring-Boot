package com.miracleit.miracle.repository;

import com.miracleit.miracle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
