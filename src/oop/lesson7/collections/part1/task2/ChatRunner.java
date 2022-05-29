package oop.lesson7.collections.part1.task2;


import java.util.ArrayList;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<ChatTask2> chatList = new ArrayList<>();
        chatList.add(new ChatTask2("Anki", new User(2, 18, "Ivan")));
        chatList.add(new ChatTask2("Apolo", new User(1, 15, "Petr")));
        chatList.add(new ChatTask2("JavaRu", new User(12, 24, "Fedor")));
        chatList.add(new ChatTask2("JavaRuS", new User(22, 32, "Dima")));

        ChatTask2 chatTest = new ChatTask2();
        System.out.println(chatTest.usersList(chatList));
        chatTest.averAgeUsers(chatTest.usersList(chatList));
    }

}
