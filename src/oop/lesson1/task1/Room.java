package oop.lesson1.task1;

public class Room {
    private boolean isPassageRoom;

    public Room(boolean isPassageRoom) {
        this.isPassageRoom = isPassageRoom;
    }

    public void printRoom() {
        System.out.println("Room passage");
    }
}
