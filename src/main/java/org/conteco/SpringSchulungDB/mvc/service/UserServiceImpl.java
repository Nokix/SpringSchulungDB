package org.conteco.SpringSchulungDB.mvc.service;

import com.github.javafaker.Faker;
import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.repository.RepositoryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    RepositoryList repositoryList;
    @Autowired
    Faker faker;

    @Override
    public List<User> findAll() {
        return repositoryList.getUsers();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return repositoryList.findUserById(id);
    }

    @Override
    public List<User> createNewUsers(Long amount) {
        List<User> users = new ArrayList<>();

        LongStream.range(0,amount).forEach(i-> {
            User user = new User(faker.number().randomNumber(), faker.funnyName().name());
            users.add(user);
            repositoryList.addUser(user);
        });

        return users;
    }

    @Override
    public User createNewUser(User user) {
        return repositoryList.addUser(user);
    }


}
