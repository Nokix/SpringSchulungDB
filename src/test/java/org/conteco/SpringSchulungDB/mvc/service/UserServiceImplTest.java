package org.conteco.SpringSchulungDB.mvc.service;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.repository.RepositoryList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @MockBean
    RepositoryList repositoryList;

    @BeforeAll
    void setup(){
        Mockito.when(repositoryList.findUserById(2L)).thenReturn(Optional.of(new User(2L, "valentin")));
    }
    @Test
    void getByIdTest(){
        Optional<User> userById = userService.findUserById(2L);
        Assertions.assertEquals(userById.get().getName(), ("valentin"));
    }
}