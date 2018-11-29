package com.hoalan.api.chi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChiRepository extends MongoRepository<Chi, String> {

  public Chi findOne(String ten);


}