package com.hoalan.api.loaisanpham;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoaisanphamRepository extends MongoRepository<Loaisanpham, String> {

  public Loaisanpham findOne(String ten);
  


}