package com.hoalan.api.goiy;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoiyRepository extends MongoRepository<Goiy, String> {

  public Goiy findOne(String noidung);


}