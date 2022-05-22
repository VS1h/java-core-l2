package oop.lesson5.task2;

public abstract class Planet {

    private String name;
    private int weigth;
    private int radius;


    public Planet(String name, int weigth, int radius) {
        this.name = name;
        this.weigth = weigth;
        this.radius = radius;
    }

    public void toCalculateDiameter(String name,int  radius) {
        System.out.println(name+" diameter = " + radius * radius);
    }

    public abstract void toCompareMass(String name,int firstWeigth, String secondName,int  secondWeigth);


    public int getWeigth() {
        return weigth;
    }
    public int getRadius() {
        return weigth;
    }

    public String getName() {
        return name;
    }


}