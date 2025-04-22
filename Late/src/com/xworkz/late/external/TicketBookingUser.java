package com.xworkz.late.external;

import com.xworkz.late.internal.TicketBooking;

public class TicketBookingUser {
    TicketBooking ticketBooking;

    public TicketBookingUser(TicketBooking ticketBooking) {
        this.ticketBooking = ticketBooking;
    }

    public void execute() {
        if (ticketBooking != null) {
            System.out.println("checking null");
            ticketBooking.bookTicket();
        }
    }
}
