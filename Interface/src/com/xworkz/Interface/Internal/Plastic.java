package com.xworkz.Interface.Internal;

public interface Plastic {
    public abstract void mold();
    public abstract void recycle();
    public abstract void melt();
    default void Quality() {
        System.out.println("The plastic quality is acceptable.");
    }
}
