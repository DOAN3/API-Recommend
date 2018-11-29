package com.hoalan.api.chitietdonhang;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChitietdonhangRepository extends MongoRepository<Chitietdonhang, String> {

  public Chitietdonhang findOne(String donvitinh);


}