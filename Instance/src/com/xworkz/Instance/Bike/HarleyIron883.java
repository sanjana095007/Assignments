package com.xworkz.Instance.Bike;

public class HarleyIron883 extends HarleyDavidson {
    public void cruiseHighway(HarleyDavidson harleyDavidson){
        harleyDavidson.accelerate();
        if(harleyDavidson instanceof HarleyIron883){
            System.out.println("Is harleyDavidson an instance of HarleyIron883");
            HarleyIron883 iron883 = (HarleyIron883) harleyDavidson;
            iron883.ThunderMode();
        }
    }

    public void ThunderMode(){
        System.out.println("running the ThunderMode");
    }
}

