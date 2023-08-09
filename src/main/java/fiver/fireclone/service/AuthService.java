package fiver.fireclone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fiver.fireclone.Dto.LoginRequest;
import fiver.fireclone.Dto.RegisterRequest;
import fiver.fireclone.repositories.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String register(RegisterRequest registerRequest) {
        // Implement register logic and user creation
        return "User registered successfully";
    }

    public String login(LoginRequest loginRequest) {
        // Implement login logic and authentication
        return "Login successful";
    }

    public String logout() {
        // Implement logout logic
        return "Logout successful";
    }
}
