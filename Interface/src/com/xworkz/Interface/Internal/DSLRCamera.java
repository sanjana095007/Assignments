package com.xworkz.Interface.Internal;

public class DSLRCamera implements Camera {
    @Override
    public void clickPhoto() {
        System.out.println("running the click Photo method");
    }

    @Override
    public void recordVideo() {
        System.out.println("running the record Video method");

    }

    @Override
    public void zoom() {
        System.out.println("running the zoom method");
    }

    @Override
    public void focus() {
        System.out.println("running the focus method");
    }
}
