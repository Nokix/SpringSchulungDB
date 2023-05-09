package org.conteco.SpringSchulungDB.mvc.service;

import org.conteco.SpringSchulungDB.mvc.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
