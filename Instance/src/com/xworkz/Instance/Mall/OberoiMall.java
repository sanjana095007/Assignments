package com.xworkz.Instance.Mall;


public class OberoiMall extends Mall {
    public void visit() {

        System.out.println("Oberoi Mall offers a luxurious shopping experience");
    }
    @Override
    public void open() {
        System.out.println("Oberoi Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Oberoi Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Oberoi mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Oberoi mall");
    }
    @Override
    public void entertain() {
        System.out.println("Oberoi Mall is offering entertainment options");
    }
}
