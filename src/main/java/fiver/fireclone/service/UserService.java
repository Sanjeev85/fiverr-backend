package fiver.fireclone.service;

import org.springframework.stereotype.Service;

import fiver.fireclone.models.User;
import fiver.fireclone.repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String deleteUser(String id) {
        var user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
            return "User deleted";
        }
        return "User doesn't exist";
    }

    public User getUser(String id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
}
