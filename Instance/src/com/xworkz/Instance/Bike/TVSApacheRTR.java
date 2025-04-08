package com.xworkz.Instance.Bike;

public class TVSApacheRTR extends TVS {
    public void startCityRace(TVS tvs){
        tvs.start();
        if(tvs instanceof TVSApacheRTR){
            System.out.println("Is tvs an instance of TVSApacheRTR");
            TVSApacheRTR apache = (TVSApacheRTR) tvs;
            apache.Power();
        }
    }

    public void Power(){
        System.out.println("running the power method.");
    }
}
