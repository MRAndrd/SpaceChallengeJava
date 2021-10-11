package com.example.spacechallengejava;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    // щоб поділити строку на частини
    String[] oneLine;

    private Context context;

    public Simulation(Context context) {
        this.context = context;
    }

    public ArrayList<Item> loadItems(String fileName) throws IOException {
        AssetManager phaseFileName = context.getAssets();
        ArrayList<Item> goods = new ArrayList<>();

        Scanner fileScanner = new Scanner(phaseFileName.open(fileName));

        while (fileScanner.hasNextLine()) {
            oneLine = fileScanner.nextLine().split("=");
            Item item = new Item(oneLine[0], Integer.parseInt(oneLine[1]));
            goods.add(item);
        }
        return goods;
    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> goods) {
        ArrayList<Rocket> listOfU1Rockets = new ArrayList<>();
        U1 U1rocket = new U1();

        for (Item item : goods) {

            if (!U1rocket.canCarry(item)) {
                listOfU1Rockets.add(U1rocket);
                U1rocket = new U1();
            }
            U1rocket.carry(item);
        }
        listOfU1Rockets.add(U1rocket);

        return listOfU1Rockets;

    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> goods) {
        ArrayList<Rocket> listOfU2Rockets = new ArrayList<>();
        U2 U2rocket = new U2();

        for (Item item : goods) {

            if (!U2rocket.canCarry(item)) {
                listOfU2Rockets.add(U2rocket);
                U2rocket = new U2();
            }
            U2rocket.carry(item);
        }
        listOfU2Rockets.add(U2rocket);

        return listOfU2Rockets;
    }
    public int runSimulation (ArrayList<Rocket> rockets ) {
        int totalBudget = 0;

        for (Rocket rocket1 : rockets) {
            do {
                totalBudget = totalBudget + rocket1.getRocketCost();
            } while (!rocket1.launch() || rocket1.land());
        }
    return totalBudget;
    }
}
