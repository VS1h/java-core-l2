package oop.lesson7.collections.part1.task1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Chat {
    private String name;
    private int numberOfUsers;

    public Chat(String name, int numberOfUsers) {
        this.name = name;
        this.numberOfUsers = numberOfUsers;
    }

    public Chat() {
    }

    public List<Chat> removeChatMoreOneThousandUsers(List<Chat> list) {
        Iterator<Chat> iterator = list.iterator();
        while (iterator.hasNext()) {
            int ONE_THOUSAND_USER = 1000;
            if (iterator.next().getNumberOfUsers() < ONE_THOUSAND_USER) {
                iterator.remove();
            }
        }
        return list;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", numberOfUsers=" + numberOfUsers +
                '}';
    }

    public static class firstNameComparator implements Comparator<Chat> {

        @Override
        public int compare(Chat o1, Chat o2) {
            if (o2.getNumberOfUsers() - o1.getNumberOfUsers() == 0) {
                return o1.getName().compareTo(o2.getName());
            } else return Integer.compare(o2.numberOfUsers, o1.numberOfUsers);
        }
    }
}
