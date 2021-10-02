package com.flightbookingservice.fare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingservice.fare.entity.Fare;
import com.flightbookingservice.fare.repository.FareRepository;

@Service
public class FareService {

	@Autowired
	private FareRepository repository;
	
	public Fare addFare(Fare fare) {
		return repository.save(fare);
	}
	
	public List<Fare> getFare()   
	{   
	List<Fare> fare = repository.findAll();   
	return fare;  
	}
	
    public String deleteFare(long id) {
    	repository.deleteById(id);
    	return "deleted fare is:" + id;
    	
    }

	
	
}
