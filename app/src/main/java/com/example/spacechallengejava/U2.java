package com.example.spacechallengejava;

public class U2 extends Rocket {
    public int chanceOfLaunchExplosionU2 = 4 * (cargoCarried / cargoLimit);
    public int chanceOfLandingCrashU2 = 8 * (cargoCarried / cargoLimit);

    public U2 () {
        rocketCost = 120;
        rocketWeight = 18000;
        maxWeight = 29000;
        cargoLimit = 11000;
    }

    @Override
    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        if(random > chanceOfLaunchExplosionU2) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        if(random > chanceOfLandingCrashU2) {
            return true;
        } else {
            return false;
        }
    }
}