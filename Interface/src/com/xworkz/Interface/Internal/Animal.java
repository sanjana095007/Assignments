package com.xworkz.Interface.Internal;

public interface Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
    default public void Scratch(){
        System.out.println("running the Scratch method ");
    }
}
