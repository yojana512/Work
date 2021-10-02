package com.flightbookingservice.search.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingservice.search.entity.Flight;
import com.flightbookingservice.search.repository.SearchRepository;

@Service
public class SearchService {

	@Autowired
	private SearchRepository repository;
	
	public Flight saveFlight(Flight flight) {
		return repository.save(flight);
	}
	
	public List<Flight> getFlight()   
	{   
	List<Flight> flight = repository.findAll();   
	return flight;  
	}
	
    public String deleteFlight(long id) {
    	repository.deleteById(id);
    	return "deleted flight is:" + id;
    	
    }
}
