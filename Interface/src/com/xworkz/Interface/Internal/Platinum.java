package com.xworkz.Interface.Internal;

public interface Platinum {
    public abstract void cut();
    public abstract void weigh();
    public abstract void sell();
    default void Purity() {
        System.out.println("Assessing the purity of platinum...");
    }
}
