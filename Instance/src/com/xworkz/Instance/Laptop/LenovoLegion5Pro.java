package com.xworkz.Instance.Laptop;

public class LenovoLegion5Pro extends Legion {
    public void initiateBattleMode(Legion legion){
        legion.features();
        if(legion instanceof LenovoLegion5Pro){
            System.out.println("Is legion an instance of LenovoLegion5Pro");
            LenovoLegion5Pro legion5Pro = (LenovoLegion5Pro) legion;
            legion5Pro.TurboCooling();
        }
    }

    public void TurboCooling(){
        System.out.println("running TurboCooling method");
    }
}
