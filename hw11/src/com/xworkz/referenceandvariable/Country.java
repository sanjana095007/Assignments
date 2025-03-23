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
        pirimeminister.display();

    }
}
