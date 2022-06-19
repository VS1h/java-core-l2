package oop.multithreading.lesson13;

public class Nigth implements Runnable{
    Planet planetForNigth;


    public Nigth(Planet planetForNigth) {
        this.planetForNigth = planetForNigth;
    }

    @Override
    public void run() {

                planetForNigth.putCrystals();
        System.out.println("Crystals create ago");
    }
}
