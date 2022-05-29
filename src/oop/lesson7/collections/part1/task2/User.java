package oop.lesson7.collections.part1.task2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private int age;
    private String nameUser;

    public User(int id, int age, String nameUser) {
        this.id = id;
        this.age = age;
        this.nameUser = nameUser;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getNameUser() {
        return nameUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", nameUser='" + nameUser + '\'' +
                '}';
    }
}
