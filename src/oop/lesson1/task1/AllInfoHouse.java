package oop.lesson1.task1;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
 * (должны присутствовать все поля объекта!).
 */
public class AllInfoHouse {

    public static void main(String[] args) {

        Room firstRoom = new Room(true);
        Room secondRoom = new Room(false);
        secondRoom.printRoom();
        Room[] oneRoom = new Room[]{firstRoom, secondRoom};
        Room[] tenRoom = new Room[]{firstRoom};
        Flat oneFlat = new Flat(oneRoom);
        Flat tenFlat = new Flat(tenRoom);
        oneFlat.setNumberFlat(1);
        tenFlat.setNumberFlat(10);
        oneFlat.printFlat();
        tenFlat.printFlat();
        Flat[] flats = new Flat[]{oneFlat, tenFlat};
        Floor firstFloor = new Floor(flats);
        firstFloor.setNumberFloor(1);
        firstFloor.printFloor();
        Floor[] floors = new Floor[]{firstFloor};
        House house = new House(floors);
        house.setNumber(13);
        house.printInfoHouse();
    }

    public void printAllInformation(House house) {
        house.printInfoHouse();
    }
}
