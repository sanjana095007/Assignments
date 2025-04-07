package com.xworkz.Instance.Bike;

public class CFMoto650MT extends CFMoto {
    public void launchTouringMode(CFMoto cfMoto){
        cfMoto.ride();
        if(cfMoto instanceof CFMoto650MT){
            System.out.println("Is bike an instance of CFMoto650MT?");
            CFMoto650MT mt650 = (CFMoto650MT) cfMoto;
            mt650.enableEcoBoost();
        }
    }

    public void enableEcoBoost(){
        System.out.println("EcoBoost mode enabled on CFMoto 650MT for efficient touring.");
    }
}

