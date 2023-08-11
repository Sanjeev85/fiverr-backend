package fiver.fireclone.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fiver.fireclone.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FetchUserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsService userDetailsService() {
        return username -> {
            return userRepository.findByUsername(username);
        };
    }
}
