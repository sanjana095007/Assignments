package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Projector;
import com.xworkz.Interface.Internal.Whiteboard;

public class InteractiveBoard implements Whiteboard, Projector {

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
}
