package com.xworkz.Instance.Laptop;

public class LenovoThinkPad extends Lenovo {
    public void startOfficeSession(Lenovo lenovo){
        lenovo.features();
        if(lenovo instanceof LenovoThinkPad){
            System.out.println("Is laptop an instance of LenovoThinkPad?");
            LenovoThinkPad thinkPad = (LenovoThinkPad) lenovo;
            thinkPad.activateBusinessMode();
        }
    }

    public void activateBusinessMode(){
        System.out.println("Business mode activated on Lenovo ThinkPad for efficient multitasking.");
    }
}
