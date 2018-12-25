package com.hoalan.api.ngaytuoi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NgaytuoiRepository extends MongoRepository<Ngaytuoi, String> {

  public Ngaytuoi findOne(String ngaytuoi);


}