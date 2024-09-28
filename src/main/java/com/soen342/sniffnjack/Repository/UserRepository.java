package com.soen342.sniffnjack.Repository;

import com.soen342.sniffnjack.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
    List<User> findDistinctByFirstNameAndLastName(String firstName, String lastName);
    List<User> findDistinctByFirstNameOrLastName(String firstName, String lastName);
}
