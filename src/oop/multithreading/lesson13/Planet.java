package oop.multithreading.lesson13;


import java.util.LinkedList;

public class Planet {
    public final int NIGHT = 1000;
    private final Object lock = new Object();
    private int redCrys;
    private int whiteCrys;
    private final LinkedList<Integer> listForCrystals = new LinkedList<>();

    public Planet() {
    }

    public synchronized void putCrystals() {
        //если кристалы на планете есть,освобождаем монитор для магов и ждем,
        // когда сработает notify()-для добавления кристаллов
        while (redCrys > 0 && whiteCrys > 0) {
            try {
                wait(NIGHT);
            } catch (InterruptedException e) {

            }}
            setCrystals();
            System.out.println("return crystals");
            System.out.println("Red crystals: " + redCrys + " White crystals: " + whiteCrys);
            notifyAll();

    }

    public synchronized void getCrystals() {
        //если кристаллы закончились,вызываем wail() освобождая монитор для пополнения putCrystals и ждем от него оповещения notify()

        while (redCrys == 0 && whiteCrys == 0) {
            try {

                wait(NIGHT);
            } catch (InterruptedException e) {
            }
        }
        removeList();
        listForCrystals.add(redCrys);
        listForCrystals.add(whiteCrys);
        clearCrystals();
        notifyAll();

    }

    public void removeList() {
        listForCrystals.clear();
    }

    public void clearCrystals() {
        redCrys = 0;
        whiteCrys = 0;
    }

    public void setCrystals() {
        redCrys = RandomUtil.getRandom();
        this.whiteCrys = RandomUtil.getRandom() + 1;
    }

    public LinkedList<Integer> getListForCrystals() {
        return listForCrystals;
    }

}



