package com.traveleasy.fullstackbackend.repository;

import com.traveleasy.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
