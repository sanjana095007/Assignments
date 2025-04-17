package com.xworkz.Interface.Internal;

public interface Steel {
    public abstract void manufacture();
    public abstract void testStrength();
    public abstract void shape();
    default void recycle() {
        System.out.println("Recycling steel for reuse.");
    }
}
