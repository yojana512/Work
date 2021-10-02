package com.flightbookingservice.fare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbookingservice.fare.entity.Fare;
import com.flightbookingservice.fare.service.FareService;

@RestController
@RequestMapping("/fare")
public class FareController {

	@Autowired
	private FareService service;
	
	@PostMapping("/addFare")
	public Fare addFare(@RequestBody Fare fare) {
		return service.addFare(fare);
	}
	
	@GetMapping("/findAllFares")
	public List<Fare> getFare()   
	{   
		return service.getFare();   
	} 
	
	@DeleteMapping("/{id}")
	public String deleteFare(@PathVariable long id) {
    	service.deleteFare(id);
    	return "deleted fare id is:" + id;
    	
    }



}
