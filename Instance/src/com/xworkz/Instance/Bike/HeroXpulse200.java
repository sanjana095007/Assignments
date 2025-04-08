package com.xworkz.Instance.Bike;

public class HeroXpulse200 extends Hero {
    public void beginTrailRide(Hero hero){
        hero.brake();
        if(hero instanceof HeroXpulse200){
            System.out.println("Is bike an instance of HeroXpulse200");
            HeroXpulse200 xpulse = (HeroXpulse200) hero;
            xpulse.performance();
        }
    }

    public void performance(){
        System.out.println("running the performance");
    }
}

