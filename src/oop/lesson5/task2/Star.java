package oop.lesson5.task2;

public class Star extends Planet {

    private int lifetime;
    private int distanceFromSun;

    public Star(String name, int weigth, int radius, int lifetime, int distanceFromSun) {
        super(name, weigth, radius);
        this.lifetime = lifetime;
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public void toCompareMass(String name, int firstWeigth, String secondName, int secondWeigth) {
        if (firstWeigth > secondWeigth) {
            System.out.println("Масса " + name + "  больше " + secondName);
        } else {
            System.out.println("Масса " + secondName + "  больше " + name);
        }

    }

    public void printLifeTimeOfStar() {
        System.out.println("Мой возраст : " + (lifetime + (int) (Math.random() * 99) + " световых лет"));
    }

    public int getLifeTime() {
        return lifetime;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }
}
