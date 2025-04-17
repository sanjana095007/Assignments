package com.xworkz.Interface.Internal;

public class WorkLaptop implements Laptop{
    @Override
    public void boot() {
        System.out.println("running the boot method");
    }

    @Override
    public void shutdown() {
        System.out.println("running the shutDown method");
    }

    @Override
    public void runProgram() {
        System.out.println("running the run program method");
    }
}
