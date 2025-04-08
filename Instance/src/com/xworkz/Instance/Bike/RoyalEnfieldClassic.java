package com.xworkz.Instance.Bike;


public class RoyalEnfieldClassic extends RoyalEnfield {
    public void startVintageCruise(RoyalEnfield enfield){
        enfield.ride();
        if(enfield instanceof RoyalEnfieldClassic){
            System.out.println("Is enfield an instance of RoyalEnfieldClassic350");
            RoyalEnfieldClassic classic = (RoyalEnfieldClassic) enfield;
            classic.thump();
        }
    }

    public void thump(){
        System.out.println("running thump");
    }
}

