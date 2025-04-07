package com.xworkz.Instance.Laptop;

public class LGGram17 extends LG {
    public void startWorkSession(LG lg){
        lg.features();
        if(lg instanceof LGGram17){
            System.out.println("Is laptop an instance of LGGram17?");
            LGGram17 gram = (LGGram17) lg;
            gram.activateBatterySaver();
        }
    }

    public void activateBatterySaver(){
        System.out.println("Battery Saver mode activated on LG Gram 17 for extended usage.");
    }
}
