package org.conteco.SpringSchulungDB.mvc.repository;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
}
