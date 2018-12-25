package com.hoalan.api.kho;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KhoRepository extends MongoRepository<Kho, String> {

  public Kho findOne(String tenhoa);


}