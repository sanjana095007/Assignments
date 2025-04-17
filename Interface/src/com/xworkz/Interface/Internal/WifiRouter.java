package com.xworkz.Interface.Internal;

public class WifiRouter implements Router{
    @Override
    public void connect() {
        System.out.println("running the connect method");
    }

    @Override
    public void disconnect() {
        System.out.println("running the disconnect method");
    }

    @Override
    public void reset() {
        System.out.println("running the reset method");
    }
}
