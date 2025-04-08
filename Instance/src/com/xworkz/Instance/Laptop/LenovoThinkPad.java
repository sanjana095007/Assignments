package com.xworkz.Instance.Laptop;

public class LenovoThinkPad extends Lenovo {
    public void startOfficeSession(Lenovo lenovo){
        lenovo.features();
        if(lenovo instanceof LenovoThinkPad){
            System.out.println("Is lenovo an instance of LenovoThinkPad");
            LenovoThinkPad thinkPad = (LenovoThinkPad) lenovo;
            thinkPad.battery();
        }
    }

    public void battery(){
        System.out.println("battery");
    }
}
