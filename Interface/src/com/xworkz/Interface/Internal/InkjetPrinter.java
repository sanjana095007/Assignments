package com.xworkz.Interface.Internal;

public class InkjetPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("running the print method");
    }

    @Override
    public void scan() {
        System.out.println("running the scan method");
    }

    @Override
    public void copy() {
        System.out.println("running the copy method");
    }

    @Override
    public void InkLevel() {
        System.out.println("running the InkLevel method");
    }
}
