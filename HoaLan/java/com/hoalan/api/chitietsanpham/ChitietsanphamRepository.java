package com.hoalan.api.chitietsanpham;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChitietsanphamRepository extends MongoRepository<Chitietsanpham, String> {

  public Chitietsanpham findOne(String soluong );


}