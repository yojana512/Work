package com.flightbookingservice.search.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flightbookingservice.search.entity.Flight;

public interface SearchRepository extends MongoRepository<Flight,Long> {

}
