package org.conteco.SpringSchulungDB.mvc.service;

import com.github.javafaker.Faker;
import org.conteco.SpringSchulungDB.mvc.entity.User;
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
    UserRepositoryList userRepository;
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
        return Stream.generate(() -> faker.funnyName().name())
                .limit(amount)
                .map(User::new)
                .map(user -> userRepository.save(user))
                .collect(Collectors.toList());
    }


}
