package oop.lesson1.task1;

public class Floor {
    private int numberFloor;
    private Flat[] flats;

    public Floor(Flat[] flats) {
        this.flats = flats;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public void printFloor() {
        System.out.println("Floor number- " + getNumberFloor() + " have " + flats.length + " flats");
    }
}

