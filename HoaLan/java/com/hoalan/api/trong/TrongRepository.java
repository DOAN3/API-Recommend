package com.hoalan.api.trong;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrongRepository extends MongoRepository<Trong, String> {

  public Trong findOne(String ten);


}