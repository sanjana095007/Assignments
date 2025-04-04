package com.xworkz.Instance.Mall;

public class SelectCityWalk extends Mall {
    public void visit() {

        System.out.println("Select City Walk is a luxurious mall in Delhi.");
    }
    @Override
    public void open() {
        System.out.println("SelectCityWalk Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Select City Walk Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Select City Walk mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Select City Walk mall");
    }
    @Override
    public void entertain() {
        System.out.println("Select City Walk Mall is offering entertainment options");
    }
}
