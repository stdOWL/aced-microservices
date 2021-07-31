package io.aced.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.aced.auth.model.User;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}
