package com.hoalan.api.donhang;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DonhangRepository extends MongoRepository<Donhang, String> {

	public Donhang findOneByTenhang(String tenhang);
  
//public Khachhang findOne(String id);

//public Donhang findOneByMaso(int maso);
//
//public Donhang findOneByThoigian(Date thoigian);


}