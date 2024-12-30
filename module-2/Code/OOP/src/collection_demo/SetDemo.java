package collection_demo;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<String> friends = new HashSet<>();
        friends.add("Ahmed");
        friends.add("Bob");
        friends.add("John");
        friends.add("John");

        System.out.println(friends);

        for(String friend: friends){
            System.out.println(friend);
        }

        friends.forEach(System.out::println);

    }
}
