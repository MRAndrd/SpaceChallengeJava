package com.example.spacechallengejava;

public class U1 extends Rocket {
public int chanceOfLaunchExplosionU1 = 5 * (cargoCarried / cargoLimit);
public int chanceOfLandingCrashU1 = 1 * (cargoCarried / cargoLimit);

public U1 () {
    rocketCost = 100;
    rocketWeight = 10000;
    maxWeight = 18000;
    cargoLimit = 8000;
}

    @Override
    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        if(random > chanceOfLaunchExplosionU1) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        if(random > chanceOfLandingCrashU1) {
            return true;
        } else {
            return false;
        }
    }
}