package org.conteco.SpringSchulungDB.mvc.repository;

import org.conteco.SpringSchulungDB.mvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);

    @Query("select u from User u where u.name like concat(?1, '%')")
    List<User> findByNameStartsWith(String name);




}
