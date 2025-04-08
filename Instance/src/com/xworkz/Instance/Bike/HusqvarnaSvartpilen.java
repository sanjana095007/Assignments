package com.xworkz.Instance.Bike;

public class HusqvarnaSvartpilen extends Husqvarna {
    public void startUrbanScramble(Husqvarna husqvarna){
        husqvarna.honk();
        if(husqvarna instanceof HusqvarnaSvartpilen){
            System.out.println("Is husqvarna an instance of HusqvarnaSvartpilen");
            HusqvarnaSvartpilen svartpilen = (HusqvarnaSvartpilen) husqvarna;
            svartpilen.Ride();
        }
    }

    public void Ride(){
        System.out.println("Running the ride");
    }
}
