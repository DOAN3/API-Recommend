package com.hoalan.api.phanbon;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhanbonRepository extends MongoRepository<Phanbon, String> {

  public Phanbon findOne(String tenhoa);


}