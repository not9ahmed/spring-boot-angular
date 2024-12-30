package streams_demo;

import java.util.List;

public class StreamSortExample {
    public static void main(String[] args) {
        List<String> names = List.of("Ahmed", "John", "Bob", "Ann", "Steve");

        System.out.println("Sorting in ascending order:");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Sorting in descending order:");
        names.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);



    }
}
