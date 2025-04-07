package com.xworkz.Instance.Bike;

public class VespaSXL extends Vespa {
    public void beginScooterCruise(Vespa vespa){
        vespa.ride();
        if(vespa instanceof VespaSXL){
            System.out.println("Is bike an instance of VespaSXL150?");
            VespaSXL sxl = (VespaSXL) vespa;
            sxl.ringBell();
        }
    }

    public void ringBell(){
        System.out.println("Running ringbell method.");
    }
}
