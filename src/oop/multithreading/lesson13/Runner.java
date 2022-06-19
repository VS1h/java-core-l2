package oop.multithreading.lesson13;

import java.util.LinkedList;
import java.util.List;

public class Runner extends Thread {
    public static void main(String[] args) throws InterruptedException {

        Thread threadMagicFire= new Thread(new MagicFire(new Planet()));
        Thread threadMagicWater= new Thread(new MagicOfWater(new Planet()));
        Thread threadNigth= new Thread(new Nigth(new Planet()));
        threadMagicFire.start();
        threadMagicWater.start();
        threadNigth.start();




    }
}
