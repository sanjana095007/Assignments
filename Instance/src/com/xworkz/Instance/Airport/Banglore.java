package com.xworkz.Instance.Airport;

public class Banglore extends KempegowdaInternational{
    public void ticket( KempegowdaInternational kempegowdaInternational){
        kempegowdaInternational.securityCheck();
        if(kempegowdaInternational instanceof Banglore){
            System.out.println("is Banglore a kempegowdaInternational ");
            Banglore blgs=(Banglore) kempegowdaInternational;
            blgs.boarding();
        }

    }
    public  void boarding (){
        System.out.println("running boarding");
    }
}
