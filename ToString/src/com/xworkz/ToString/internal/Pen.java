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
    @Override
    public int hashCode() {
        return 166;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Pen) {
                System.out.println("Reference of Pen will be compared");
                Pen pen = this;
                Pen pen1 = (Pen) obj;
                if (pen.brand.equals(pen1.brand) && pen.inkColor.equals(pen1.inkColor)) {
                    System.out.println("Both pens are same");
                    return true;
                }
            }
        }
        return false;
    }

}
