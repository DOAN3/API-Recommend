package com.hoalan.api.nhacungcap;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NhacungcapRepository extends MongoRepository<Nhacungcap, String> {

  public Nhacungcap findOneByTen(String ten);


}