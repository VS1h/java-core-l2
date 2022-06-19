package oop.multithreading.lesson13;

import java.util.LinkedList;

public class MagicFire implements Runnable {
    private int redCrystalSum = 0;
    private int whiteCrystalSum = 0;
    Planet planetForMagicFire;

    public MagicFire(Planet planetForMagicFire) {
        this.planetForMagicFire = planetForMagicFire;
    }

    @Override
    public void run() {
        while(redCrystalSum!=500 && whiteCrystalSum!=500){
            planetForMagicFire.getCrystals();
            LinkedList<Integer> listGetCrystals = planetForMagicFire.getListForCrystals();
            for (int i = 0; i < listGetCrystals.size()-1; i++) {
                redCrystalSum += listGetCrystals.get(i);
                whiteCrystalSum += listGetCrystals.get(i+1);
                System.out.println("Magic of Fire  red crystals: "+redCrystalSum+ " white crystals: "+whiteCrystalSum);
            }
        }
        System.out.println("Magic of Water are getting 500 red and white crystals");


    }

    public int getRedCrystalSum() {
        return redCrystalSum;
    }

    public int getWhiteCrystalSum() {
        return whiteCrystalSum;
    }
}
