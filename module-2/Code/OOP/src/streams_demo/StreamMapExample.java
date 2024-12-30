package streams_demo;

import java.util.List;

public class StreamMapExample {

    public static void main(String[] args) {
        List<String> names = List.of("Ahmed", "John", "Bob", "Ann", "Steve");

        names.stream()
                .sorted()
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);


        List<Integer> prices = List.of(55, 129, 200, 1000);

        Integer discount = 10;

        List<Integer> pricesDiscounted = prices.stream()
                .map(price -> price - (price * discount / 100))
                .toList();

        System.out.println("Prices after discount "+ pricesDiscounted);

    }
}
