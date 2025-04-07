package com.xworkz.Instance.Bike;

public class HeroXpulse200 extends Hero {
    public void beginTrailRide(Hero hero){
        hero.brake();
        if(hero instanceof HeroXpulse200){
            System.out.println("Is bike an instance of HeroXpulse200?");
            HeroXpulse200 xpulse = (HeroXpulse200) hero;
            xpulse.activateNavigationAssist();
        }
    }

    public void activateNavigationAssist(){
        System.out.println("Navigation Assist activated on Hero Xpulse 200 for off-road trails.");
    }
}

