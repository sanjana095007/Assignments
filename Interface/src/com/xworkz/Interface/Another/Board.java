package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Laptop;
import com.xworkz.Interface.Internal.Projector;
import com.xworkz.Interface.Internal.Whiteboard;


public class Board implements Whiteboard, Projector, Laptop {

    @Override
    public void write() {
        System.out.println("running the write method in InteractiveBoard");
    }

    @Override
    public void erase() {
        System.out.println("running the erase method in InteractiveBoard");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method in InteractiveBoard");
    }

    @Override
    public void powerOn() {
        System.out.println("running the powerOn method in InteractiveBoard");
    }

    @Override
    public void display() {
        System.out.println("running the display method in InteractiveBoard");
    }

    @Override
    public void focus() {
        System.out.println("running the focus method in InteractiveBoard");
    }

    @Override
    public void boot() {
        System.out.println("running the boot method in InteractiveBoard");

    }

    @Override
    public void shutdown() {
        System.out.println("running the shutdown method in InteractiveBoard");

    }

    @Override
    public void runProgram() {
        System.out.println("running the runProgram method in InteractiveBoard");

    }
}
