package org.conteco.SpringSchulungDB.mvc.service;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.repository.UserRepositoryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepositoryList userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
