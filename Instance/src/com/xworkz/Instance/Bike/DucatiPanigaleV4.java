package com.xworkz.Instance.Bike;

public class DucatiPanigaleV4 extends Ducati {
    public void initiateRaceMode(Ducati ducati){
        ducati.ride();
        if(ducati instanceof DucatiPanigaleV4){
            System.out.println("Is bike an instance of DucatiPanigaleV4?");
            DucatiPanigaleV4 panigale = (DucatiPanigaleV4) ducati;
            panigale.activateQuickShift();
        }
    }

    public void activateQuickShift(){
        System.out.println("Quick Shift activated on Ducati Panigale V4 for lightning-fast gear changes.");
    }
}

