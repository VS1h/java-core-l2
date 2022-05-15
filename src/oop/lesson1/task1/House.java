package oop.lesson1.task1;

public class House {
    private int numberHouse;
    private Floor[] floors;

    public House(Floor[] floors) {
        this.floors = floors;
    }

    public int getNumber() {

        return numberHouse;
    }

    public void setNumber(int numberHouse) {

        this.numberHouse = numberHouse;
    }

    public void printInfoHouse() {
        System.out.println("House № " + getNumber() + " it's have " + floors.length + " floors");
    }
}
