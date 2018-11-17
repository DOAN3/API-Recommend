package com.example.repository;





import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Donhang;

public interface DonhangRepository extends MongoRepository<Donhang, String> {

public Donhang findOneByTenhang(String tenhang);
  
//  public Khachhang findOne(String id);

//public Donhang findOneByMaso(int maso);
//
//public Donhang findOneByThoigian(Date thoigian);








}
