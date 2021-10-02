package com.flightbookingservice.fare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flightbookingservice.fare.entity.Fare;


public interface FareRepository extends MongoRepository<Fare,Long> {

}
