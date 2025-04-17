package com.xworkz.Interface.Internal;

public interface Router {
    public abstract void connect();
    public abstract void disconnect();
    public abstract void reset();
    default void ReConnection() {
        System.out.println("Checking the Reconnection status of the router");
    }
}
