package com.hoalan.api.sanpham;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SanphamRepository extends MongoRepository<Sanpham, String> {
	


public Sanpham findByTen(String ten);
public	Sanpham findByMota(String mota);




@Query("{ 'gia' : { $gt: ?0, $lt: ?1 } }")

public List<Sanpham> findSanphamByGiaBetween(int giabe, int gialon);
public Sanpham findByGia(int gia);
public Sanpham findOne(String id);


	
}


