package com.example.SupportDeskPro.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.SupportDeskPro.entity.User;
import com.example.SupportDeskPro.repository.UserRepository;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUsersById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
    }

}
