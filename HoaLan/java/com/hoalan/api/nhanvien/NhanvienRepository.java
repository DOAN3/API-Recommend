package com.hoalan.api.nhanvien;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NhanvienRepository extends MongoRepository<Nhanvien, String> {

  public Nhanvien findOneByTen(String ten);


}