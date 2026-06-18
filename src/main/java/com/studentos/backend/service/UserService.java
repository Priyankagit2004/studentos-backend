package com.studentos.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.studentos.backend.model.User;
import com.studentos.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public User registerUser(User user) {

        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public String loginUser(String email, String password) {

        User user = userRepository.findByEmail(email)
                .orElse(null);

        if (user == null) {
            return "User not found";
        }

        if (passwordEncoder.matches(password, user.getPassword())) {
            return "Login Successful";
        }

        return "Invalid Password";
    }
}