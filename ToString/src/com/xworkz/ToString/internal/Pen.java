package com.xworkz.ToString.internal;

public class Pen {
   private String brand;
   private String inkColor;
   private boolean isGelPen;

    public Pen(String brand, String inkColor, boolean isGelPen) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.isGelPen = isGelPen;
    }

    public String toString() {
        return "Pen - Brand: " + brand + ", Ink Color: " + inkColor + ", Gel Pen: " + isGelPen;
    }
}
