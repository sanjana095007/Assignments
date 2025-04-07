package com.xworkz.Instance.Bike;

public class SuzukiGixxer extends Suzuki {
    public void beginStreetRide(Suzuki suzuki){
        suzuki.ride();
        if(suzuki instanceof SuzukiGixxer){
            System.out.println("Is bike an instance of SuzukiGixxerSF?");
            SuzukiGixxer gixxer = (SuzukiGixxer) suzuki;
            gixxer.Engine();
        }
    }

    public void Engine(){
        System.out.println("running the engine ");
    }
}

