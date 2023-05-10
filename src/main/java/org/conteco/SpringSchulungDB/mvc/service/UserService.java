package org.conteco.SpringSchulungDB.mvc.service;

import org.conteco.SpringSchulungDB.mvc.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    Optional<User> getById(Long id);

    List<User> createNewUsers(Long amount);

    User saveUser(User user);

    Optional<User> findByName(String name);
}
