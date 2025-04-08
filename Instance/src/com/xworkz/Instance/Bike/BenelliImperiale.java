package com.xworkz.Instance.Bike;

public class BenelliImperiale extends Benelli {
    public void initiateCruise(Benelli benelli){
        benelli.ride();
        if(benelli instanceof BenelliImperiale){
            System.out.println("Is benelli an instance of BenelliImperiale");
            BenelliImperiale imperiale = (BenelliImperiale) benelli;
            imperiale.ClassicMode();
        }
    }

    public void ClassicMode(){
        System.out.println("Running the classic mode.");
    }
}

