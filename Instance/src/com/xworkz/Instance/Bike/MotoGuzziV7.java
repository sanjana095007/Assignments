package com.xworkz.Instance.Bike;

public class MotoGuzziV7 extends MotoGuzzi {
    public void beginClassicRide(MotoGuzzi motoGuzzi){
        motoGuzzi.ride();
        if(motoGuzzi instanceof MotoGuzziV7){
            System.out.println("Is motoGuzzi an instance of MotoGuzziV7Stone");
            MotoGuzziV7 v7 = (MotoGuzziV7) motoGuzzi;
            v7.speed();
        }
    }

    public void speed(){
        System.out.println("running speed ");
    }
}

