package org.conteco.SpringSchulungDB.mvc.controller;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/users/find")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getById2(@RequestParam Long id) {
        return userService.getById(id);
    }

    @PostMapping("/users/generate")
    @ResponseStatus(HttpStatus.CREATED)
    public List<User> generateUsers(
            @RequestParam(name = "n", defaultValue = "5") Long amount) {
        return userService.createNewUsers(amount);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
