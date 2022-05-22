package oop.lesson5.task2;

import java.util.logging.SocketHandler;

public class Moon extends Earth implements Temperature {


    public Moon(String name, int weigth, int radius, int distanceFromSun) {
        super(name, weigth, radius, distanceFromSun);
    }

    @Override
    public void calculateGravity(String name, int weigth) {
        System.out.println("Луна притягивает "+name+" силой " + " F= " + (weigth / STRONG_GRAVITY) + "N");
    }

    @Override
    public void temperatureAtSurface() {
        System.out.println("На темной стороне Луны всегда холодно!");
    }


}


