package com.xworkz.Private;

public class jailerCell {
    public void jailer(Jail[] jails) {
        for(Jail jail :jails ){
            if(jail !=null){
                System.out.println("Jail Name: " + jail.getName());
                System.out.println("Location: " + jail.getLocation());
                System.out.println("Jailer Name: " + jail.getJailerName());
                System.out.println("Total Cells: " + jail.getTotalCells());
            }
        }

    }
    public void values(){

            Jail[] jail=new Jail[2];;

            jail[0]=new Jail();
            jail[0].setName("Central Jail");
            jail[0].setLocation("Bangalore");
            jail[0].setJailerName("Rajesh Kumar");
            jail[0].setTotalCells(150);

        jail[1]=new Jail();
        jail[1].setName("Central Jail");
        jail[1].setLocation("balary");
        jail[1].setJailerName("umesh");
        jail[1].setTotalCells(530);

            jailer(jail);
    }










}
