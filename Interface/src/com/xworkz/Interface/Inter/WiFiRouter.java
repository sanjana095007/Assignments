package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Router;
import com.xworkz.Interface.Internal.Wire;

public class WiFiRouter implements Router, Wire {
    @Override
    public void connect() {
        System.out.println("running the connect method in WiFiRouter");
    }

    @Override
    public void disconnect() {
        System.out.println("running the disconnect method in WiFiRouter");
    }


    @Override
    public void reset() {
        System.out.println("running the reset method in WiFiRouter");
    }
    @Override
    public void transmit() {
        System.out.println("running the transmit method in WiFiRouter");
    }

    @Override
    public void insulate() {
        System.out.println("running the insulate method in WiFiRouter");
    }
    @Override
    public void connects(){

    }
}
