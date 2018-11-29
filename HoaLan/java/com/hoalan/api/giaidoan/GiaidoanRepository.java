package com.hoalan.api.giaidoan;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GiaidoanRepository extends MongoRepository<Giaidoan, String> {

  public Giaidoan findOne(String naymam);


}