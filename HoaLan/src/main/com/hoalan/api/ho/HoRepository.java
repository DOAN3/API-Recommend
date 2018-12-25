package com.hoalan.api.ho;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HoRepository extends MongoRepository<Ho, String> {

  public Ho findOne(String ten);


}