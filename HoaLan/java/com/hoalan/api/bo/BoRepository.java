package com.hoalan.api.bo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoRepository extends MongoRepository<Bo, String> {

  public Bo findOne(String ten);


}