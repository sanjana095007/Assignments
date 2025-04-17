package com.xworkz.Interface.Internal;

public interface Mobile {
    public abstract void call();
    public abstract void text();
    public abstract void browseInternet();
    default void Charge() {
        System.out.println("Battery status: 75%");
    }
}
