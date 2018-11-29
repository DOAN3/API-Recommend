package com.hoalan.api.sanpham;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SanphamRepository extends MongoRepository<Sanpham, Long> {

  public Sanpham findOneByTen(long hinhanh);


}