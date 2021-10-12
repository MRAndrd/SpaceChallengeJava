package com.example.spacechallengejava;

public class U2 extends Rocket {

    public U2 () {
        rocketCost = 120;
        rocketWeight = 18000;
        maxWeight = 29000;
        cargoLimit = 11000;
    }

    @Override
    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        int chanceOfLaunchExplosionU2 = 4 * (cargoCarried / cargoLimit);
            return random > chanceOfLaunchExplosionU2;
    }

    @Override
    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        int chanceOfLandingCrashU2 = 8 * (cargoCarried / cargoLimit);
            return random > chanceOfLandingCrashU2;
    }
}