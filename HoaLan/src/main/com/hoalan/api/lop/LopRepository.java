package com.hoalan.api.lop;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LopRepository extends MongoRepository<Lop, String> {

  public Lop findOne(String ten);


}