package com.example.spacechallengejava;

public class U1 extends Rocket {
public int chanceOfLaunchExplosionU1 = 5 * (rocketCanCarry / maxWeight);
public int chanceOfLandingCrashU1 = 1 * (rocketCanCarry / maxWeight);

public U1 () {
    rocketCost = 100;
    rocketWeight = 10;
    maxWeight = 18;
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