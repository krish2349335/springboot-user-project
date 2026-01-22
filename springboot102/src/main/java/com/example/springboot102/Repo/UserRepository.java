package com.example.springboot102.Repo;

import com.example.springboot102.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    List<User> findByName(String name);
    List<User> findByNameAndAge(String name, int age);
    List<User> findByAge(int age);
}
