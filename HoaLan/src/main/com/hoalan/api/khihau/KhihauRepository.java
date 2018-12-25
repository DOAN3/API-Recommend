package com.hoalan.api.khihau;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KhihauRepository extends MongoRepository<Khihau, String> {

  public Khihau findOne(String dat);


}