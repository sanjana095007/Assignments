package com.xworkz.Instance.Laptop;

public class LenovoLegion5Pro extends Legion {
    public void initiateBattleMode(Legion legion){
        legion.features();
        if(legion instanceof LenovoLegion5Pro){
            System.out.println("Is laptop an instance of LenovoLegion5Pro?");
            LenovoLegion5Pro legion5Pro = (LenovoLegion5Pro) legion;
            legion5Pro.enableTurboCooling();
        }
    }

    public void enableTurboCooling(){
        System.out.println("Turbo Cooling enabled on Lenovo Legion 5 Pro for high-performance gaming.");
    }
}
