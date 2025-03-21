package com.xworkz.InstanceVariable;

public class Virat {
    Brush brush;
    Clip clip;
    Ticket ticket;
    Cricket cricket;

    Virat(Brush brush, Ticket ticket, Cricket cricket){
        this.brush=brush;
        //this.clip=clip;
        this.ticket=ticket;
        this.cricket=cricket;
    }
    void play(){
        if(cricket != null){
            cricket.profit();
            cricket.watch();
            System.out.println("running plane in virat");
        }
        else{
            System.out.println("no play");
        }

    }
    void clean(){
        if(brush != null){
            brush.clean();
            brush.scrub();
            System.out.println("running clean in virat");
        }
        else{
            System.out.println("no clean");
        }

    }
    void relax(){
        if(ticket != null){
            ticket.sell();
            ticket.Buy();
            System.out.println("running relax in virat");
        }
        else {
            System.out.println("no clean");
        }
    }
}
