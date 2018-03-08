package com.may.the.fourth.be.with.you.two.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.may.the.fourth.be.with.you.two.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
