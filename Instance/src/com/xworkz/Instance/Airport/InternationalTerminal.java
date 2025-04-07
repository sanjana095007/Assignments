package com.xworkz.Instance.Airport;

public class InternationalTerminal extends RajivGandhi {
    public void handleDeparture(RajivGandhi rajivGandhi){
        rajivGandhi.board();
        if(rajivGandhi instanceof InternationalTerminal){
            System.out.println("is rajivGandhi airport an InternationalTerminal");
            InternationalTerminal terminal = (InternationalTerminal) rajivGandhi;
            terminal.announceFlight();
        }
    }

    public void announceFlight(){
        System.out.println("running the announceFlight method");
    }
}

