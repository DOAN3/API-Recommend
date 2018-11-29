package com.hoalan.api.thanhtoan;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ThanhtoanRepository extends MongoRepository<Thanhtoan, String> {

  public Thanhtoan findOne(String hinhthuc);


}