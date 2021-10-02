package com.flightbookingservice.search.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection ="flight")
public class Flight {
 @Id
	private long id;
	private String flightNumber;
	private String origin;
	private String destination;
	private String date;
	private Fares fare;
	
	
	
	public Flight(long id, String flightNumber, String origin, String destination, String date, Fares fare) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.fare = fare;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Fares getFare() {
		return fare;
	}
	public void setFare(Fares fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination="
				+ destination + ", date=" + date + "]";
	}
	
	
	
	
	
}
