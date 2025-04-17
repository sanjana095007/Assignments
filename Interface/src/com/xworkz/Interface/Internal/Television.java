package com.xworkz.Interface.Internal;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public interface Television {
    public abstract void switchChannel();
    public abstract void adjustVolume();
    public abstract void powerOff();
    default void tv(){
        System.out.println("running the tv method");
    }
}
