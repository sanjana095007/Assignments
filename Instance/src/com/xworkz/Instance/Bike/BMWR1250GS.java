package com.xworkz.Instance.Bike;

public class BMWR1250GS extends BMW {
    public void startAdventure(BMW bmw){
        bmw.ride();
        if(bmw instanceof BMWR1250GS){
            System.out.println("Is bike an instance of BMWR1250GS?");
            BMWR1250GS r1250 = (BMWR1250GS) bmw;
            r1250.enableEnduroMode();
        }
    }

    public void enableEnduroMode(){
        System.out.println("Enduro mode activated on BMW R1250GS for off-road performance.");
    }
}

