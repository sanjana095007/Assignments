package com.xworkz.Interface.Internal;

public interface PaintBrush {
    public abstract void dipInPaint();
    public abstract void applyPaint();
    public abstract void cleanBrush();
default void Watercolor(){
    System.out.println("running the Watercolor method");
}
}
