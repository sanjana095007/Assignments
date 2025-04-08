package com.xworkz.Instance.Bike;

public class YamahaR15 extends Yamaha {
    public void launchSportMode(Yamaha yamaha){
        yamaha.honk();
        if(yamaha instanceof YamahaR15){
            System.out.println("Is bike an instance of YamahaR15");
            YamahaR15 r15 = (YamahaR15) yamaha;
            r15.Boost();
        }
    }

    public void Boost(){
        System.out.println("ruuning the boost method.");
    }
}
