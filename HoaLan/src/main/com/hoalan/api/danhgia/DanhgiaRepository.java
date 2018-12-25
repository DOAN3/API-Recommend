package com.hoalan.api.danhgia;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DanhgiaRepository extends MongoRepository<Danhgia, String> {

  public Danhgia findOne(String noidung);


}