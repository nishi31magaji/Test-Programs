package com.yodlee.Test2;

public class TicketBookingClient {
	//ticket booking system bookmyshow is a facade 
	// user need not have to worry about mobile number validation logic
	// ticket booking logic / send notification logic its all been done in facade
	public static void main(String[] args) {
	 /*	MobileNumberValidator m = new MobileNumberValidator();
		if(m.isValidNumber()) {
			TicketBookingSystem t = new TicketBookingSystem();
			t.bookTicket();
		}
		SendNotification notification = new SendNotification();
		notification.send();*/
		TicketBookingFacade t = new TicketBookingFacade();
		t.startBooking();
	}
}
