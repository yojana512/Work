package com.flightbookingservice.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbookingservice.search.entity.Flight;

import com.flightbookingservice.search.service.SearchService;

@RestController
@RequestMapping("/api")
public class SearchController {

	
	@Autowired
	private SearchService service;
	
	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) {
		return service.saveFlight(flight);
	}
	
	@GetMapping(value = "/findAllFlights")  
	public List<Flight> getFlight()   
	{   
		return service.getFlight();   
	}  
	
	@DeleteMapping("/delete/{id}")
	public String deleteFlight(@PathVariable long id) {
    	service.deleteFlight(id);
    	return "deleted flight is:" + id;
    	
    }
	
}
