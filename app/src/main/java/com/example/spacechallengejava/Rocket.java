package com.example.spacechallengejava;

public class Rocket implements SpaceShip {
    public static int rocketCost;
    public int rocketWeight;
    public int maxWeight;
    public int rocketCanCarry = maxWeight - rocketWeight;

    public static int getRocketCost() {
        return rocketCost;
    }


    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if (maxWeight >= (rocketWeight + item.weight)) {
            return true;
        } else {
            return false;
        }
    };

    @Override
    public int carry(Item item) {
        rocketWeight = rocketWeight+ item.weight;
        return rocketWeight;
    };
}