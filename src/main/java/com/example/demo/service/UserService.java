package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findById(Integer id) {
        User user = userRepository.findById(id);
        return user;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(String name, Integer age, String job, String specialty) {
        User user = userRepository.save(new User(null, name, age, job, specialty));
        return user;
    }
}
