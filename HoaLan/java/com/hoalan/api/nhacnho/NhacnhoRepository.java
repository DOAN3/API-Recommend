package com.hoalan.api.nhacnho;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NhacnhoRepository extends MongoRepository<Nhacnho, String> {

  public Nhacnho findOne(String thongtinkhachhang);


}