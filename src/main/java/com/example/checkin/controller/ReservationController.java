package com.example.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.checkin.dto.Reservation;
import com.example.checkin.dto.ReservationUpdateRequest;
import com.example.checkin.integration.ReservationRestfulClient;

@Controller
public class ReservationController {
	@Autowired
	private ReservationRestfulClient restClient;

	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";

	}

	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		// System.out.println(reservation.getId());
		// System.out.println(reservation.getNumberOfBags());
		// System.out.println(reservation.isCheckedIn());
		// System.out.println(reservation.getPassenger().getFirstName());
		// System.out.println(reservation);
		return "displayReservation";

	}

	@RequestMapping("/proceedToCheckIn")
	public String proceedToCheckIn(@RequestParam("id") Long id, @RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberofBags(numberOfBags);
		request.setCheckInStatus(true);
		
		
		return "confirmReservation";

	}
}
