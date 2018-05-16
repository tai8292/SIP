package com.foobar.User.repository;

import com.foobar.User.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByUsernameAndPassword(String username,String password);
}
