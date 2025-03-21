package com.xworkz.InstanceVariable;

public class Ticket {
    TicketType ticketype;
    int cost;
    Ticket(TicketType ticketype,int cost){
        this.ticketype=ticketype;
        this.cost=cost;
    }
    void Buy(){
        System.out.println("buying tickets from : "+ticketype);
    }
    void sell(){
        System.out.println("selling the tickets for : "+cost);
    }
}
