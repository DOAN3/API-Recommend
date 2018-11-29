package com.hoalan.api.goiyphu;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoiyphuRepository extends MongoRepository<Goiyphu, String> {

  public Goiyphu findOne(String sanphamgoiyphu);


}