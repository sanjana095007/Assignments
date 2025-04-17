package com.xworkz.Interface.Internal;

public class Bulldog implements Dog{
    @Override
    public void bark() {
        System.out.println("running the bark method");
    }

    @Override
    public void fetch() {
        System.out.println("running the fetch method");
    }

    @Override
    public void wagTail() {
        System.out.println("running the wag Tail method");
    }
}
