package com.example.spacechallengejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    // щоб поділити строку на частини
    String[] oneLine;

    public Simulation(MainActivity mainActivity) {
    }

    public ArrayList<Item> loadItems() throws FileNotFoundException {
        ArrayList<Item> goods = new ArrayList<>();
        File file = new File("Phase-1.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            oneLine = fileScanner.nextLine().split("=");
            Item item = new Item(oneLine[0], Integer.parseInt(oneLine[1]));
            goods.add(item);
        }
        return goods;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> goods, ArrayList<Item> loadItems) {
        ArrayList<Rocket> listOfU1RocketsU1 = new ArrayList<>();
        U1 U1rocket = new U1();

        for (Item item : goods) {

            if (!U1rocket.canCarry(item)) {
                listOfU1RocketsU1.add(U1rocket);
                U1rocket = new U1();
            }
            U1rocket.carry(item);
        }
        listOfU1RocketsU1.add(U1rocket);

        return listOfU1RocketsU1;

    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> goods, ArrayList<Item> loadItems) {
        ArrayList<Rocket> listOfU1RocketsU2 = new ArrayList<>();
        U2 U2rocket = new U2();

        for (Item item : goods) {

            if (!U2rocket.canCarry(item)) {
                listOfU1RocketsU2.add(U2rocket);
                U2rocket = new U2();
            }
            U2rocket.carry(item);
        }
        listOfU1RocketsU2.add(U2rocket);

        return listOfU1RocketsU2;
    }
    public int runSimulation (ArrayList<Rocket> listOfU1RocketsU1, ArrayList<Rocket> listOfU1RocketsU2 ) {
        int totalBudget = 0;

        Rocket rocket1 = new U1(); {
            if (!rocket1.land() || !rocket1.launch()) {
                totalBudget += Rocket.getRocketCost();
            }
            return totalBudget;
        }
    }

}
