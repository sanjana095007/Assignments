package com.xworkz.Interface.Internal;

public class WildAnimal implements Animal{
    @Override
    public void eat() {
        System.out.println("running the eat method");
    }

    @Override
    public void sleep() {
        System.out.println("running the sleep method");
    }

    @Override
    public void makeSound() {
        System.out.println("running the makeSound method");
    }
}
