package com.mohak.spring.Legostore.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mohak.spring.Legostore.model.LegoSet;

public interface LegoStoreRepository extends MongoRepository<LegoSet, String> {

}
