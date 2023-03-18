package com.example.checkin.dto;

import java.sql.Timestamp;
import java.util.Date;

public class Flight {
	private long id;
	private String flightNumber;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfdeparture;
	private Timestamp estimatedDepartureTime;

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

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfdeparture() {
		return dateOfdeparture;
	}

	public void setDateOfdeparture(Date dateOfdeparture) {
		this.dateOfdeparture = dateOfdeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}
