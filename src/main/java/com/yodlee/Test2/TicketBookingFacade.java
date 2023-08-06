package com.yodlee.Test2;

public class TicketBookingFacade {
public void startBooking() {
	MobileNumberValidator m = new MobileNumberValidator();
	if(m.isValidNumber()) {
		TicketBookingSystem t = new TicketBookingSystem();
		t.bookTicket();
	}
	SendNotification notification = new SendNotification();
	notification.send();
}
}
