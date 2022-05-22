package oop.lesson5.task2;

public class Rocket extends SpaceShip implements Flying, Temperature {


    public Rocket(String name, int power, int liftCapacity, int distanceOfFligth) {
        super(name, power, liftCapacity, distanceOfFligth);
    }

    @Override
    public void temperatureAtSurface() {
        System.out.println("Температура за бортом не пригодна для жизни");

    }


    public void toFly(String name, int aPoint, int bPoint, int distanceOfFligth) {
        if (aPoint - bPoint <= distanceOfFligth) {
            System.out.println("я долечу до " + name);
        } else {
            System.out.println("Упс...Нужен корабль помощнее!");
        }
    }
}
