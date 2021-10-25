package com.samp.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samp.blog.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
