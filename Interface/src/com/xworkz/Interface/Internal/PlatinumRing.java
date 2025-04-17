package com.xworkz.Interface.Internal;

public class PlatinumRing implements Platinum  {
    @Override
    public void cut() {
        System.out.println("running the cut method");
    }

    @Override
    public void weigh() {
        System.out.println("running the weigh method");
    }

    @Override
    public void sell() {
        System.out.println("running the sell method");
    }

    @Override
    public void Purity() {
        System.out.println("running the Purity method");
    }
}
