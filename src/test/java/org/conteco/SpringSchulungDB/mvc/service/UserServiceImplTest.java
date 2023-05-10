package org.conteco.SpringSchulungDB.mvc.service;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.conteco.SpringSchulungDB.mvc.repository.UserRepositoryList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @MockBean
    UserRepositoryList userRepositoryList;


    @Test
    public void getByIdTest() {
        Mockito.when(userRepositoryList.findById(2L))
                .thenReturn(Optional.of(new User(2L, "Gustav")));

        Optional<User> userOptional = userService.getById(2L);
        assertEquals("Gustav", userOptional.get().getName());
    }

}