package org.conteco.SpringSchulungDB.mvc.repository;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryList {
    private List<User> users = new ArrayList<>();

    public UserRepositoryList() {
        this.users.add(new User(1L, "Christian"));
        this.users.add(new User(2L, "Elisa"));
    }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User save(User user) {
        users.add(user);
        return user;
    }
}
