package com.br.sfb.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.br.sfb.blog.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	 Optional<User> findByUserName(String username);

}