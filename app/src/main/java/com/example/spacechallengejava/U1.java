package com.example.spacechallengejava;

public class U1 extends Rocket {

public U1 () {
    rocketCost = 100;
    rocketWeight = 10000;
    maxWeight = 18000;
    cargoLimit = 8000;
}

    @Override
    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        int chanceOfLaunchExplosionU1 = 5 * (cargoCarried / cargoLimit);
        return random > chanceOfLaunchExplosionU1;
    }
    @Override
    public boolean land() {
        int random = (int) (Math.random() * 100 + 1);
        int chanceOfLandingCrashU1 = 1 * (cargoCarried / cargoLimit);
        return random > chanceOfLandingCrashU1;
    }
}
