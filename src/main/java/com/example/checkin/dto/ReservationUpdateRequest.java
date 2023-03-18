package com.example.checkin.dto;

public class ReservationUpdateRequest {
	private long id;
	private int numberofBags;
	private boolean checkInStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumberofBags() {
		return numberofBags;
	}

	public void setNumberofBags(int numberofBags) {
		this.numberofBags = numberofBags;
	}

	public boolean isCheckInStatus() {
		return checkInStatus;
	}

	public void setCheckInStatus(boolean checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

}
