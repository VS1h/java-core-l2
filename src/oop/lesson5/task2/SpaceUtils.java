package oop.lesson5.task2;

public final class SpaceUtils {

    private SpaceUtils() {
    }

    public static void isStar(Planet planet, SpaceShip spaceShip) {
        System.out.println("притягивает c силой притяжения = " +
                (planet.getWeigth() * 2 / spaceShip.getPower()));
    }

    public static boolean isStar(Planet planet) {
        return planet instanceof Star;
    }
}
