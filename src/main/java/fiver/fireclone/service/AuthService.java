package fiver.fireclone.service;

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
        var user = User.builder().username(registerRequest.getUsername())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .username(registerRequest.getUsername()).build();

        userRepository.save(user);
        var jwt = jwtService.generateToken(user);
        return " jwt " + jwt.toString();
    }

    public String login(LoginRequest loginRequest) {
        System.out.println("auth service");
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(),
                        loginRequest.getPassword()));
        User user = userRepository.findByUsername(loginRequest.getEmail());
        var jwt = jwtService.generateToken(user);
        return jwt;
    }

    public String logout() {
        return "Logout successful";
    }
}
