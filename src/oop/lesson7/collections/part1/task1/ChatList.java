package oop.lesson7.collections.part1.task1;


import java.util.*;

public class ChatList {
    public static void main(String[] args) {
        List<Chat> list = new ArrayList<>();
        list.add(new Chat("Peoples", 900));
        list.add(new Chat("Citizens", 1999));
        list.add(new Chat("Anki", 1999));
        list.add(new Chat("Jararush", 7300));
        list.add(new Chat("Men", 1900));
        Chat chatTest= new Chat();
        System.out.println(chatTest.removeChatMoreOneThousandUsers(list));
        list.sort(new Chat.firstNameComparator());
        System.out.println(list);
    }
}

