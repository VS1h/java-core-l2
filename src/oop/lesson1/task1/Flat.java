package oop.lesson1.task1;

public class Flat {
    private int numberFlat;
    private Room[] rooms;

    public Flat(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public void printFlat() {
        System.out.println("Flat number- " + getNumberFlat() + " have " + rooms.length + " rooms");
    }
}
