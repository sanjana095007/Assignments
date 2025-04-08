package com.xworkz.Instance.Bike;

public class KawasakiNinja extends Kawasaki {
    public void initiateTrackMode(Kawasaki kawasaki){
        kawasaki.brake();
        if(kawasaki instanceof KawasakiNinja){
            System.out.println("Is kawasaki an instance of KawasakiNinjaZX6R");
            KawasakiNinja ninja = (KawasakiNinja) kawasaki;
            ninja.Control();
        }
    }

    public void Control(){
        System.out.println("running the control method");
    }
}

