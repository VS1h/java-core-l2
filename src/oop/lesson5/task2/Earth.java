package oop.lesson5.task2;

public class Earth extends Planet {
    final public int STRONG_GRAVITY = 10;
    private int distanseFromSun;

    public Earth(String name, int weigth, int radius, int distanceFromSun) {
        super(name, weigth, radius);
        this.distanseFromSun = distanceFromSun;
    }
    public String toString(){
        return "Name planet "+getName()+", Weigth "+getWeigth()+", Radius "+getRadius()
                +", Distance from Sun "+getDistanseFromSun();
    }

    @Override
    public void toCompareMass(String name,int firstWeigth, String secondName,int  secondWeigth) {
        if (firstWeigth > secondWeigth) {
            System.out.println("Масса "+ name+"  больше "+ secondName);
        } else {
            System.out.println("Масса "+ secondName+"  больше "+ name);
        }
    }

    public void calculateGravity(String name, int weigth) {
        System.out.println("Земля притягивает "+name+" силой " + " F= " + (weigth / STRONG_GRAVITY) + "N");
    }

    public int getDistanseFromSun() {
        return distanseFromSun;
    }


}
