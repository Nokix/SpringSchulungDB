package org.conteco.SpringSchulungDB.mvc.service;

import com.github.javafaker.Faker;
import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.repository.UserRepository;
import org.conteco.SpringSchulungDB.mvc.repository.UserRepositoryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    Faker faker;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> createNewUsers(Long amount) {
        return Stream
                .generate(faker.funnyName()::name)
                .limit(amount)
                .map(name -> new User(null, name, null))
                .map(userRepository::save)
                .collect(Collectors.toList());
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByName(String name) {
        return userRepository.findByName(name);
    }
}
