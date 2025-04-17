package com.xworkz.Interface.Internal;

public interface Book {
    public abstract void read();
    public abstract  void open();
    public abstract void close();
    default void bookmark() {
        System.out.println("Default bookmark method: bookmarking the current page.");
    }
}
