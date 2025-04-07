package com.xworkz.Instance.Laptop;

public class AsusROGStrix extends Asus {
    public void startGamingArena(Asus asus){
        asus.charge();
        if(asus instanceof AsusROGStrix){
            System.out.println("Is laptop an instance of AsusROGStrix?");
            AsusROGStrix rog = (AsusROGStrix) asus;
            rog.power();
        }
    }

    public void power(){
        System.out.println("running power");
    }
}
