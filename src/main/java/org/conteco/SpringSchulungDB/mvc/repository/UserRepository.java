package org.conteco.SpringSchulungDB.mvc.repository;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
}
