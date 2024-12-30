package streams_demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamExample {

    public static void main(String[] args) {

        List<String> names = List.of("Ahmed", "John", "Bob", "Ann", "Steve");

        Stream<String> namesStream = names.stream();
//        namesStream.forEach(System.out::println);


        List<String> filteredList = names.stream()
                .filter(el -> el.startsWith("A"))
                .toList();

        System.out.println(filteredList);


    }
}
