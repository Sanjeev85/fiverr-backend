package fiver.fireclone.service;

import fiver.fireclone.models.Role;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fiver.fireclone.Dto.LoginRequest;
import fiver.fireclone.Dto.RegisterRequest;
import fiver.fireclone.models.User;
import fiver.fireclone.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public String register(RegisterRequest registerRequest) {
        var user = User.builder().email(registerRequest.getEmail())
                .role(Role.USER)
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .username(registerRequest.getUsername()).build();
        System.out.println("saving data " + user.toString());
        userRepository.save(user);
        var jwt = jwtService.generateToken(user);
        return " jwt " + jwt;
    }

    public String login(LoginRequest loginRequest) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                        loginRequest.getPassword()));
        User user = userRepository.findByUsername(loginRequest.getUsername());
        var jwt = jwtService.generateToken(user);
        return jwt;
    }

    public String logout() {
        return "Logout successful";
    }
}
