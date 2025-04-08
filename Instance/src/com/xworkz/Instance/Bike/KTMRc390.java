package com.xworkz.Instance.Bike;

public class KTMRc390 extends KTM {
    public void engageRaceMode(KTM ktm){
        ktm.accelerate();
        if(ktm instanceof KTMRc390){
            System.out.println("Is bike an instance of KTMRc390");
            KTMRc390 rc390 = (KTMRc390) ktm;
            rc390.launch();
        }
    }

    public void launch(){
        System.out.println("running launch");
    }
}

