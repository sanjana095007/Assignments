package com.xworkz.Instance.Bike;

public class BenelliImperiale extends Benelli {
    public void initiateCruise(Benelli benelli){
        benelli.ride();
        if(benelli instanceof BenelliImperiale){
            System.out.println("Is bike an instance of BenelliImperiale?");
            BenelliImperiale imperiale = (BenelliImperiale) benelli;
            imperiale.enableClassicMode();
        }
    }

    public void enableClassicMode(){
        System.out.println("Classic mode activated on Benelli Imperiale for a smooth cruise.");
    }
}

