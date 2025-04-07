package com.xworkz.Instance.Bike;

public class ApriliaRS660 extends Aprilia {
    public void prepareRide(Aprilia aprilia){
        aprilia.brake();
        if(aprilia instanceof ApriliaRS660){
            System.out.println("Is bike an instance of ApriliaRS660?");
            ApriliaRS660 rs660 = (ApriliaRS660) aprilia;
            rs660.activateSportMode();
        }
    }

    public void activateSportMode(){
        System.out.println("Activating Sport Mode on the Aprilia RS 660.");
    }
}

