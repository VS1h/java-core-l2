package oop.multithreading.lesson13;

import java.util.LinkedList;

public class MagicOfWater implements Runnable {
    private int redCrystalSum = 0;
    private int whiteCrystalSum = 0;
    Planet planetForMagicWater;

    public MagicOfWater(Planet planetForMagicFire) {
        this.planetForMagicWater = planetForMagicFire;
    }

    @Override
    public void run() {
        while(redCrystalSum!=500 && whiteCrystalSum!=500){
            planetForMagicWater.getCrystals();
            LinkedList<Integer> listGetCrystals = planetForMagicWater.getListForCrystals();
            for (int i = 0; i < listGetCrystals.size()-1; i++) {
                redCrystalSum += listGetCrystals.get(i);
                whiteCrystalSum += listGetCrystals.get(i+1);
            }
            System.out.println("Magic of water  red crystals: "+redCrystalSum+ " white crystals: "+whiteCrystalSum);

        }
        System.out.println("Magic of water are getting 500 red and white crystals");

    }
}
