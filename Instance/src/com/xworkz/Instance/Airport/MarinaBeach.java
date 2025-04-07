package com.xworkz.Instance.Airport;

public class MarinaBeach extends Chennai{
    public void pricing( Chennai chennai){
        chennai.takeOff();
        if(chennai instanceof MarinaBeach){
            System.out.println("is Chennai a Marina Beach ");
            MarinaBeach marinaBeach=(MarinaBeach) chennai;
            marinaBeach.boarding();
        }

    }
    public  void boarding (){
        System.out.println("running boarding");
    }
}
