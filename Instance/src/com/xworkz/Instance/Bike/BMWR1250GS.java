package com.xworkz.Instance.Bike;

public class BMWR1250GS extends BMW {
    public void startAdventure(BMW bmw){
        bmw.ride();
        if(bmw instanceof BMWR1250GS){
            System.out.println("Is bmw an instance of BMWR1250GS");
            BMWR1250GS r1250 = (BMWR1250GS) bmw;
            r1250.Speed();
        }
    }

    public void Speed(){
        System.out.println("running the speed method.");
    }
}

