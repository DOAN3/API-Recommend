package com.hoalan.api.hotro;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotroRepository extends MongoRepository<Hotro, String> {

  public Hotro findOne(String noidung);


}