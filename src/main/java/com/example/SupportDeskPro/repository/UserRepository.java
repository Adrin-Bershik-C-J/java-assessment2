package com.example.SupportDeskPro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SupportDeskPro.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
