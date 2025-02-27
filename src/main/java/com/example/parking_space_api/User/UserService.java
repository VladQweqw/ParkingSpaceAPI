package com.example.parking_space_api.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> {
            throw new IllegalStateException("Invalid user ID");
        });
    }


    public User loginUser(LoginDetails loginDetails) {
        String email = loginDetails.getEmail();
        String password = loginDetails.getPassword();

        User found = userRepository.findUserByEmail(email).orElseThrow(() -> {
            throw new IllegalStateException("Invalid email");
        });

        if(found.checkPassword(password)) {
            return found;
        }else {
            throw new IllegalStateException("Invalid passowrd");
        }
    }

    public User registerUser(RegisterDetails details) {
        Optional<User> found = userRepository.findUserByEmail(details.getEmail());

        if(found.isPresent()) {
            throw new IllegalStateException("User with same email already exists");
        }else {
            User new_user = new User(
                    details.getName(),
                    details.getEmail(),
                    details.getPassword()
            );
            return userRepository.save(new_user);
        }
    }
}
