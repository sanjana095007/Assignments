package com.xworkz.Private;

public class jailerCell {
    public void jailer(Jail jail) {
            System.out.println("Jail Name: " + jail.getName());
            System.out.println("Location: " + jail.getLocation());
            System.out.println("Jailer Name: " + jail.getJailerName());
            System.out.println("Total Cells: " + jail.getTotalCells());
    }
    public void values(){
            Jail jail=new Jail();;
            jail.setName("Central Jail");
            jail.setLocation("Bangalore");
            jail.setJailerName("Rajesh Kumar");
            jail.setTotalCells(150);
            jailer(jail);
    }










}
