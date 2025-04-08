package com.xworkz.Instance.Bike;

public class CFMoto650MT extends CFMoto {
    public void launchTouringMode(CFMoto cfMoto){
        cfMoto.ride();
        if(cfMoto instanceof CFMoto650MT){
            System.out.println("Is bike an instance of CFMoto650MT");
            CFMoto650MT mt650 = (CFMoto650MT) cfMoto;
            mt650.EcoBoost();
        }
    }

    public void EcoBoost(){
        System.out.println("running the ecoboost method");
    }
}

