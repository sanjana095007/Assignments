package com.xworkz.InstanceVariable;

public class Cricket {
    Ticket ticket;
    Cricket(Ticket ticket){
        this.ticket=ticket;
    }
    void watch() {
        if (ticket != null) {
            ticket.Buy();
            System.out.println("watching the cricket by booking the tickets");
        } else {
            System.out.println("no ticket found for cricket");
        }
    }
    void profit(){
            if(ticket != null){
                ticket.sell();
                System.out.println("profit after selling the tickets");
            }
            else{
                System.out.println("no profits");
            }
        }

}
