package com.example.checkin.integration;

import com.example.checkin.dto.Reservation;

public interface ReservationRestfulClient {
	public Reservation findReservation(Long id);
}
