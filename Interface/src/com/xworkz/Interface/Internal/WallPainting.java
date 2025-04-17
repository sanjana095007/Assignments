package com.xworkz.Interface.Internal;

public class WallPainting implements PaintBrush {
    @Override
    public void dipInPaint() {
        System.out.println("running the dip In Paint method");
    }

    @Override
    public void applyPaint() {
        System.out.println("running the apply Paint method");
    }

    @Override
    public void cleanBrush() {
        System.out.println("running the clean Brush Paint method");
    }
}
