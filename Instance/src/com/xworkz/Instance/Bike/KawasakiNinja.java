package com.xworkz.Instance.Bike;

public class KawasakiNinja extends Kawasaki {
    public void initiateTrackMode(Kawasaki kawasaki){
        kawasaki.brake();
        if(kawasaki instanceof KawasakiNinja){
            System.out.println("Is bike an instance of KawasakiNinjaZX6R?");
            KawasakiNinja ninja = (KawasakiNinja) kawasaki;
            ninja.Control();
        }
    }

    public void Control(){
        System.out.println("Kawasaki Ninja for high-speed cornering stability.");
    }
}

