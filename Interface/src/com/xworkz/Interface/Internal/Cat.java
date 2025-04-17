package com.xworkz.Interface.Internal;

public interface Cat {
    public abstract void meow();
    public abstract void scratch();
    public abstract void climb();
    default void purr() {
        System.out.println("Default purr method: The cat is purring contentedly.");
    }
}
