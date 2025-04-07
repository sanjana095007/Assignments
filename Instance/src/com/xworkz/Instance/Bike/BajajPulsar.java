package com.xworkz.Instance.Bike;

public class BajajPulsar extends Bajaj {
    public void beginJourney(Bajaj bajaj){
        bajaj.honk();
        if(bajaj instanceof BajajPulsar){
            System.out.println("Is bike an instance of BajajPulsar?");
            BajajPulsar pulsar = (BajajPulsar) bajaj;
            pulsar.boostPerformance();
        }
    }

    public void boostPerformance(){
        System.out.println("Boosting performance mode on Bajaj Pulsar.");
    }
}

