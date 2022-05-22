package oop.lesson5.task2;

public class SpaceRunner {
    public static void main(String[] args) {
        Earth earth=new Earth("Земля",1000,343,3000);
        Moon moon=new Moon("Луна",400, 134,2800);
        Star star=new Star("Звезда",4000,200, 3000, 1800);
        Asteroid asteroid=new Asteroid("QID223",1900,112,300,1000, 30000);
        SpaceShip moonCar=new Rocket("Луноход",4000,1500,400);
        Rocket rocket=new Rocket("Союз",10000,4000,1000);
        System.out.println(earth.toString());
        earth.calculateGravity(star.getName(),star.getWeigth());
        moon.calculateGravity(asteroid.getName(),asteroid.getWeigth());
        moon.temperatureAtSurface();
        System.out.println();
        earth.toCompareMass(earth.getName(), earth.getWeigth(), asteroid.getName(), asteroid.getWeigth());
        asteroid.toFly(earth.getName(), earth.getDistanseFromSun(), asteroid.getDistanceFromSun(), asteroid.getDistanceOfFligth());
        asteroid.printFlyingNow();
        System.out.println();
        star.printLifeTimeOfStar();
        star.toCompareMass(moon.getName(), moon.getWeigth(), earth.getName(), earth.getWeigth());
        earth.toCalculateDiameter(earth.getName(), earth.getRadius());
        System.out.println();
        moonCar.fligthTime(moon.getName(), earth.getDistanseFromSun(),moon.getDistanseFromSun(), moonCar.getPower());
        moonCar.printFlyingNow();
        System.out.println();
        rocket.toFly(star.getName(), star.getDistanceFromSun(),earth.getDistanseFromSun(), rocket.getDistanceOfFligth());
        rocket.printFlyingNow();
        rocket.temperatureAtSurface();


    }
}
