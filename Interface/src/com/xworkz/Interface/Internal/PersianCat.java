package com.xworkz.Interface.Internal;

public class PersianCat implements Cat{
    @Override
    public void meow() {
        System.out.println("running the meow method");
    }

    @Override
    public void scratch() {
        System.out.println("running the scratch method");
    }

    @Override
    public void climb() {
        System.out.println("running the climb method");
    }

    @Override
    public void purr() {
        System.out.println("running the purr method");
    }
}
