package com.xworkz.referenceandvariable;

public class Country {
    String name;
    long population;
    String currency;
    String capital;
    PrimeMinister pirimeminister = new PrimeMinister("Narendra Modi", 73, 10);

    Country(String name, long population, String currency, String capital) {
        this.name = name;
        this.population = population;
        this.currency = currency;
        this.capital = capital;
    }

    void display() {

        System.out.println("------------------");
        System.out.println("the name of the country is :" +this.name);
        System.out.println("The population of county is : " + this.population);
        System.out.println("The currency of county is :" + this.currency);
        System.out.println("The capital of county is :" + this.capital);
        //System.out.println("The PrimeMinister name is : " + pirimeminister.name);
        //System.out.println("The PrimeMinister age is : " + pirimeminister.age);
        //System.out.println("The PrimeMinister Years is :" + pirimeminister.years);
        pirimeminister.display();

    }
}
