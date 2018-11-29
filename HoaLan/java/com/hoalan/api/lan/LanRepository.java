package com.hoalan.api.lan;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanRepository extends MongoRepository<Lan, String> {

  public Lan findOne(String ten);


}