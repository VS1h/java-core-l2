package oop.lesson7.collections.part1.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет
 * список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

public class ChatTask2 {
    private String nameChat;
    private User user;

    public ChatTask2(String nameChat, User user) {
        this.nameChat = nameChat;
        this.user = user;
    }

    public ChatTask2() {
    }

    public void averAgeUsers(List<User> list) {
        double averAge = 0;
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()) {
            averAge += iterator.next().getAge();
        }
        System.out.println(averAge / list.size());
    }

    public List<User> usersList(List<ChatTask2> list) {
        List<User> allUsersList = new ArrayList<>();
        Iterator<ChatTask2> iterator = list.iterator();
        while (iterator.hasNext()) {
            ChatTask2 allUsers = iterator.next();
            int AGE = 18;
            if (allUsers.getUser().getAge() >= AGE) {
                allUsersList.add(allUsers.getUser());
            }
        }
        return allUsersList;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "ChatTask2{" +
                "nameChat='" + nameChat + '\'' +
                ", user=" + user +
                '}';
    }
}
