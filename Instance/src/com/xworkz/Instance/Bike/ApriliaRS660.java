package com.xworkz.Instance.Bike;

public class ApriliaRS660 extends Aprilia {
    public void prepareRide(Aprilia aprilia){
        aprilia.brake();
        if(aprilia instanceof ApriliaRS660){
            System.out.println("Is aprilia an instance of ApriliaRS660");
            ApriliaRS660 rs660 = (ApriliaRS660) aprilia;
            rs660.SportMode();
        }
    }

    public void SportMode(){
        System.out.println("running the SportMode");
    }
}

