package org.conteco.SpringSchulungDB.mvc.repository;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class RepositoryList {
    List<User> users = new ArrayList<>();

    public RepositoryList() {
        this.users.add(new User(1L, "Christian"));
        this.users.add(new User(2L, "Elisa"));
    }

    public List<User> getUsers() {
        return users;
    }

    public Optional<User> findUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User addUser(User user){
        users.add(user);
        return user;
    }
}
