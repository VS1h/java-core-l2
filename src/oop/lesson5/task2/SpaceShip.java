package oop.lesson5.task2;

public class SpaceShip implements Flying {
    private String name;
    private int power;
    private int liftCapacity;
    private int distanceOfFligth;

    public SpaceShip(String name, int power, int liftCapacity, int distanceOfFligth) {
        this.name = name;
        this.power = power;
        this.liftCapacity = liftCapacity;
        this.distanceOfFligth = distanceOfFligth;
    }

    public void fligthTime(String name, int aPoint, int bPoint, int distanceOfFligth) {
        System.out.println("Время полета до "+ name+" составит " + (aPoint-bPoint/power));
    }

    public String getName() {
        return name;
    }

    public int getDistanceOfFligth() {
        return distanceOfFligth;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void toFly(String name, int aPoint, int bPoint, int distanceOfFligth) {
        if (aPoint-bPoint <= distanceOfFligth) {
            System.out.println("я долечу до " + name);
        } else {
            System.out.println("Упс...Нужен корабль помощнее!");
        }
    }

    @Override
    public void printFlyingNow() {
        System.out.println("Короче я уже на страте! Поеехалии!");

    }
}
