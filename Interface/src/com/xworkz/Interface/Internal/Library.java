package com.xworkz.Interface.Internal;

public class Library implements Book{

    @Override
    public void read() {
        System.out.println("running the read method");
    }

    @Override
    public void open() {
        System.out.println("running the open method");
    }

    @Override
    public void close() {
        System.out.println("running the close method");
    }

    @Override
    public void bookmark() {
        System.out.println("running the bookmark method");
    }
}
