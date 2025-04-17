package com.xworkz.Interface.Internal;

public interface Oven {
    public abstract void bake();
    public abstract void grill();
    public abstract void preheat();
    default void Boil() {
        System.out.println("Running Boil method");
    }
}
