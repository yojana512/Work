package com.flightbookingservice.fare.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Fare")
public class Fare {
	@Id
	private long id;
	private String flightNumber;
	private String date;
	private String fare;
	
	public Fare() {
		super();
	}

	public Fare(long id, String flightNumber, String date, String fare) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Fare [id=" + id + ", flightNumber=" + flightNumber + ", date=" + date + ", fare=" + fare + "]";
	}
	
	

}
