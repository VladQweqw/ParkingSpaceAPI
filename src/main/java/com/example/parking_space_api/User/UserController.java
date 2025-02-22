package com.example.parking_space_api.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "{id}") // Fix: Removed hyphen from path variable
    public User getUsersById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("create") // Fix: Added unique path
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("login") // Fix: Added unique path
    public User loginUser(@RequestBody LoginDetails loginDetails) {
        return userService.loginUser(loginDetails);
    }

    @PostMapping("register") // Fix: Added unique path
    public User registerUser(@RequestBody RegisterDetails registerDetails) {
        return userService.registerUser(registerDetails);
    }
}
