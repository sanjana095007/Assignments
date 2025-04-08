package com.xworkz.Instance.Laptop;

public class LGGram17 extends LG {
    public void startWorkSession(LG lg){
        lg.features();
        if(lg instanceof LGGram17){
            System.out.println("Is lg an instance of LGGram17");
            LGGram17 gram = (LGGram17) lg;
            gram.BatterySaver();
        }
    }

    public void BatterySaver(){
        System.out.println("running Battery Saver mode ");
    }
}
