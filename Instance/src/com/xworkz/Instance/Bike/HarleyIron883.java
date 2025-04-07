package com.xworkz.Instance.Bike;

public class HarleyIron883 extends HarleyDavidson {
    public void cruiseHighway(HarleyDavidson harleyDavidson){
        harleyDavidson.accelerate();
        if(harleyDavidson instanceof HarleyIron883){
            System.out.println("Is bike an instance of HarleyIron883?");
            HarleyIron883 iron883 = (HarleyIron883) harleyDavidson;
            iron883.enableThunderMode();
        }
    }

    public void enableThunderMode(){
        System.out.println("Thunder Mode activated on Harley Iron 883 for a deep rumbling ride.");
    }
}

