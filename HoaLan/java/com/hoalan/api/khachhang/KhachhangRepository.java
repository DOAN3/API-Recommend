package com.hoalan.api.khachhang;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface KhachhangRepository extends MongoRepository<Khachhang, String> {
	



public Khachhang findOneByTen(String ten);
  



}